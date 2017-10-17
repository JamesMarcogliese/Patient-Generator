package fhir;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.dstu2.composite.*;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.*;
import ca.uhn.fhir.model.primitive.*;
import core.model.Metadata;
import core.model.componentModel.Address;
import core.model.componentModel.AlternateIdentifier;
import core.model.componentModel.Demographic;
import core.model.componentModel.Name;
import core.PropertiesService;
import fhir.configuration.FhirConfigurationSection;
import fhir.configuration.FhirEndpoint;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import javax.json.Json;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Represents a utility for generating FHIR messages using the HL7 FHIR framework.
 */
public class FhirUtility {
    private FhirConfigurationSection configuration;

    /**
     * Initializes a new instance of the FhirUtility class.
     * Grabs the FHIR endpoint configuration from the properties file.
     */
    public FhirUtility() {
        configuration = new FhirConfigurationSection();
        ArrayList<FhirEndpoint> endpoints = new ArrayList<>();
        FhirEndpoint endpoint = new FhirEndpoint();
        endpoint.setAddress(new PropertiesService().getPropertyValue("fhirEndpointAddress"));
        endpoint.setRequiresAuthorization(Boolean.valueOf(new PropertiesService().getPropertyValue("fhirEndpointAuth")));
        endpoint.setName(new PropertiesService().getPropertyValue("fhirEndpointName"));
        endpoints.add(endpoint);
        configuration.setEndpoints(endpoints);
    }

    /**
     * Generates the candidate registry.
     * @param options The options.
     * @return Patient.
     */
    public Patient generateCandidateRegistry(Demographic options){
        Patient patient = new Patient();

        patient.setActive(true);
        patient.setAddress(new ArrayList<>());

        for (Address currentAddress : options.getAddresses()) {
            AddressDt address = new AddressDt();
            address.setCity(currentAddress.getCity());
            address.setCountry(currentAddress.getCountry());

            ArrayList<StringDt> line = new ArrayList<>();
            StringDt addressStrDt = new StringDt(currentAddress.getStreetAddress());
            line.add(addressStrDt);
            address.setLine(line);

            address.setState(currentAddress.getStateProvince());
            address.setPostalCode(currentAddress.getZipPostalCode());
            patient.addAddress(address);
        }

        if(options.getDateOfBirthOptions() != null){

            if(options.getDateOfBirthOptions().getExact() != null){

                DateDt date = new DateDt(options.getDateOfBirthOptions().getExact().getYear(),
                                         options.getDateOfBirthOptions().getExact().getMonthValue(),
                                         options.getDateOfBirthOptions().getExact().getDayOfMonth());
                patient.setBirthDate(date);

            } else if (options.getDateOfBirthOptions().getStart() != null && options.getDateOfBirthOptions().getEnd() != null){
                int startYear = options.getDateOfBirthOptions().getStart().getYear();
                int endYear = options.getDateOfBirthOptions().getEnd().getYear();

                int startMonth = options.getDateOfBirthOptions().getStart().getMonthValue();
                int endMonth = options.getDateOfBirthOptions().getEnd().getMonthValue();

                int startDay = options.getDateOfBirthOptions().getStart().getDayOfMonth();
                int endDay = options.getDateOfBirthOptions().getEnd().getDayOfMonth();

                DateDt date = new DateDt(ThreadLocalRandom.current().nextInt(startYear, endYear + 1),
                                         ThreadLocalRandom.current().nextInt(startMonth, endMonth + 1),
                                         ThreadLocalRandom.current().nextInt(startDay, endDay + 1));
                patient.setBirthDate(date);
            } else {
                DateDt date = new DateDt(ThreadLocalRandom.current().nextInt(1900, LocalDateTime.now().getYear() + 1),
                        ThreadLocalRandom.current().nextInt(1, 12 + 1),
                        ThreadLocalRandom.current().nextInt(1, 28 + 1));
                patient.setBirthDate(date);
            }
        }

        if (options.getGender() == null){
            options.setGender("U");
        }

        switch (options.getGender()){
            case "F": case "f":
            case "female": case "Female":
                patient.setGender(AdministrativeGenderEnum.FEMALE);
                break;

            case "M": case "m":
            case "male": case "Male":
                patient.setGender(AdministrativeGenderEnum.MALE);
                break;

            case "O": case "o":
            case "other": case "Other":
                patient.setGender(AdministrativeGenderEnum.OTHER);
                break;

            default:
                patient.setGender(AdministrativeGenderEnum.UNKNOWN);
                break;
        }

        patient.setIdentifier(new ArrayList<>());
        for (AlternateIdentifier currentAlternateIdentifier : options.getOtherIdentifiers()) {
            IdentifierDt identifier = new IdentifierDt(currentAlternateIdentifier.getAssigningAuthority(), currentAlternateIdentifier.getValue());
            patient.addIdentifier(identifier);
        }

        for (Name currentName : options.getNames()) {
            HumanNameDt humanName = new HumanNameDt();

            StringDt familyName = new StringDt(currentName.getLastName());
            humanName.addFamily(familyName);

            ArrayList<StringDt> givenNames = new ArrayList<>();
            StringDt givenName = new StringDt(currentName.getFirstName());
            givenNames.add(givenName);
            humanName.setGiven(givenNames);

            patient.addName(humanName);
        }

        patient.setTelecom(new ArrayList<>());
        for (String currentEmailAddress : options.getTelecomOptions().getEmailAddresses()) {
            ContactPointDt contactPoint = new ContactPointDt();
            contactPoint.setSystem(ContactPointSystemEnum.EMAIL);
            contactPoint.setUse(ContactPointUseEnum.MOBILE);
            contactPoint.setValue(currentEmailAddress);
            patient.addTelecom(contactPoint);
        }

        for (String currentPhoneNumber : options.getTelecomOptions().getPhoneNumbers()) {
            ContactPointDt contactPoint = new ContactPointDt();
            contactPoint.setSystem(ContactPointSystemEnum.PHONE);
            contactPoint.setUse(ContactPointUseEnum.MOBILE);
            contactPoint.setValue(currentPhoneNumber);
            patient.addTelecom(contactPoint);
        }

        return patient;
    }

    /**
     * Generates the candidate registry.
     * @param patient The patient.
     * @param metadata The metadata.
     * @return Returns the generated patient from the given patient and the metadata.
     */
    public Patient generateCandidateRegistry(core.model.common.Patient patient, Metadata metadata){

        Patient fhirPatient = new Patient();

        fhirPatient.setActive(true);
        fhirPatient.setAddress(new ArrayList<>());

        AddressDt address = new AddressDt();
        address.setCity(patient.getCity());
        address.setCountry(patient.getCountry());

        ArrayList<StringDt> line = new ArrayList<>();
        StringDt addressStrDt = new StringDt(patient.getAddressLine());
        line.add(addressStrDt);
        address.setLine(line);

        address.setState(patient.getProvince());
        address.setPostalCode(patient.getPostalCode());
        address.setUse(AddressUseEnum.HOME);
        fhirPatient.addAddress(address);

        DateDt date = new DateDt(patient.getDateOfBirth().getYear(),
                                patient.getDateOfBirth().getMonthValue(),
                                patient.getDateOfBirth().getDayOfYear());
        fhirPatient.setBirthDate(date);

        fhirPatient.setCommunication(new ArrayList<>());
        Patient.Communication communication = new Patient.Communication();
        communication.setLanguage(new CodeableConceptDt("urn:ietf:bcp:47", "English"));
        communication.setPreferred(true);
        fhirPatient.addCommunication(communication);
        communication.setLanguage(new CodeableConceptDt("urn:ietf:bcp:47", "Swahili"));
        communication.setPreferred(true);
        fhirPatient.addCommunication(communication);

        fhirPatient.setContact(new ArrayList<>());
        Patient.Contact contact = new Patient.Contact();
        HumanNameDt contactHumanName = new HumanNameDt();
        contactHumanName.setFamily(new ArrayList<>());
        contactHumanName.addFamily(patient.getLastName());
        contactHumanName.setGiven(new ArrayList<>());
        contactHumanName.addGiven("Mary");
        contactHumanName.setUse(NameUseEnum.OFFICIAL);
        contact.setName(contactHumanName);
        contact.setRelationship(new ArrayList<>());
        contact.addRelationship(new CodeableConceptDt("", "Mother"));
        fhirPatient.addContact(contact);

        fhirPatient.setDeceased(new DateTimeDt(Date.from(Instant.now())));

        fhirPatient.setId(IdDt.newRandomUuid());

        fhirPatient.setIdentifier(new ArrayList<>());
        fhirPatient.addIdentifier(new IdentifierDt("urn:oid" + metadata.getAssigningAuthority(), patient.getHealthCardNo()));

        fhirPatient.setMultipleBirth(new BooleanDt(true));

        fhirPatient.setName(new ArrayList<>());
        HumanNameDt humanName = new HumanNameDt();
        humanName.setFamily(new ArrayList<>());
        humanName.addFamily(patient.getLastName());
        humanName.setGiven(new ArrayList<>());
        humanName.addGiven(patient.getFirstName());
        humanName.addGiven(patient.getMiddleName());
        humanName.setUse(NameUseEnum.OFFICIAL);
        fhirPatient.addName(humanName);

        ContactPointDt contactPoint = new ContactPointDt();
        contactPoint.setSystem(ContactPointSystemEnum.PHONE);
        contactPoint.setUse(ContactPointUseEnum.MOBILE);
        contactPoint.setValue(patient.getPhoneNo());
        fhirPatient.addTelecom(contactPoint);

        if (patient.getGender() == null){
            patient.setGender("U");
        }

        switch (patient.getGender()){
            case "F": case "f":
            case "female": case "Female":
                fhirPatient.setGender(AdministrativeGenderEnum.FEMALE);
                break;

            case "M": case "m":
            case "male": case "Male":
                fhirPatient.setGender(AdministrativeGenderEnum.MALE);
                break;

            case "O": case "o":
            case "other": case "Other":
                fhirPatient.setGender(AdministrativeGenderEnum.OTHER);
                break;

            default:
                fhirPatient.setGender(AdministrativeGenderEnum.UNKNOWN);
                break;
        }

        return fhirPatient;
    }

    /**
     * Sends the FHIR messages.
     * @param patient The patient.
     * @return List of send statuses.
     */
    public List<Boolean> sendFhirMessages(Patient patient){

        ArrayList<Boolean> results = new ArrayList<>();

        for (FhirEndpoint currentEndpoint : configuration.getEndpoints()) {

            CloseableHttpClient httpClient = HttpClients.createDefault();

            HttpPost httppost = new HttpPost(currentEndpoint.getAddress());

            if (currentEndpoint.getRequiresAuthorization()) {
                httppost.addHeader("Authorization", getAuthorizationToken(currentEndpoint));
            }

            FhirContext ctx = FhirContext.forDstu2();

            StringEntity content = new StringEntity(ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(patient),
                    ContentType.create("application/xml+fhir", "UTF-8"));
            httppost.removeHeaders("Content-Type");
            httppost.addHeader("Content-Type", "application/xml+fhir");
            httppost.setEntity(content);

            try {

                HttpEntity response = httpClient.execute(httppost).getEntity();
                //javax.json.JsonReader jsonReader = Json.createReader(response.getContent());
                //javax.json.JsonObject json = jsonReader.readObject();
                //jsonReader.close();
                //System.out.println(json.toString());


                httpClient.close();
            } catch (Exception e) {
                e.printStackTrace();
            }



        }
        return results;
    }

    /**
     * Gets the authorization token.
     * @param endpoint The endpoint.
     * @return Returns a string representing the authorization token.
     */
    public String getAuthorizationToken(FhirEndpoint endpoint){
        String accessToken = null;

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost(endpoint.getAddress());

        try {
            StringEntity content;
            httppost.addHeader("Authorization","BASIC " + Base64.getMimeEncoder().encodeToString((endpoint.getAuthorizationConfiguration().getApplicationId() + ":" + endpoint.getAuthorizationConfiguration().getApplicationSecret()).getBytes("UTF8")));
            content = new StringEntity("grant_type=password&username=" + endpoint.getAuthorizationConfiguration().getUsername() + "&password=" + endpoint.getAuthorizationConfiguration().getPassword() + "&scope=" + endpoint.getAuthorizationConfiguration().getScope());
            httppost.removeHeaders("Content-Type");
            httppost.addHeader("Content-Type", "application/x-www-form-urlencoded");
            httppost.setEntity(content);

            HttpEntity response = httpClient.execute(httppost).getEntity();
            javax.json.JsonReader jsonReader = Json.createReader(response.getContent());
            javax.json.JsonObject json = jsonReader.readObject();
            jsonReader.close();

            accessToken = json.getJsonObject("access_token").toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return accessToken;
    }
}
