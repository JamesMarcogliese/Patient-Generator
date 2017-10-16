import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import core.model.Metadata;
import core.model.componentModel.*;
import fhir.FhirUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FhirTests {

    private Demographic options;
    private FhirUtility fhirUtility;

    @AfterEach
    void tearDown() {
        options = null;
        fhirUtility = null;
    }

    @BeforeEach
    void setUp() {
        options = new Demographic();

        ArrayList<Address> addresses = new ArrayList<>();

        Address address1 = new Address();
        address1.setCity("Brampton");
        address1.setCountry("Canada");
        address1.setStateProvince("Ontario");
        address1.setStreetAddress("123 Main Street West");
        address1.setZipPostalCode("L6X0C3");
        addresses.add(address1);

        Address address2 = new Address();
        address2.setCity("New York City");
        address2.setCountry("United States of America");
        address2.setStateProvince("New York");
        address2.setStreetAddress("250 Madison Ave.");
        address2.setZipPostalCode("07008");
        addresses.add(address2);

        Address address3 = new Address();
        address3.setCity("Friedberg");
        address3.setCountry("Germany");
        address3.setStateProvince("Elbonia");
        address3.setStreetAddress("Grüner Weg 6");
        address3.setZipPostalCode("578233");
        addresses.add(address3);

        options.setAddresses(addresses);

        DateOfBirthOptions dateOfBirthOptions = new DateOfBirthOptions();
        dateOfBirthOptions.setExact(LocalDateTime.of(
                ThreadLocalRandom.current().nextInt(1900, 2014),
                ThreadLocalRandom.current().nextInt(1, 12),
                ThreadLocalRandom.current().nextInt(1, 28),
                0,
                0,
                0,
                0));
        options.setDateOfBirthOptions(dateOfBirthOptions);

        options.setGender("F");

        Metadata metadata = new Metadata();
        metadata.setSendingFacility("SEEDING");
        metadata.setSendingApplication("SEEDER");
        metadata.setReceivingFacility("Test");
        metadata.setReceivingApplication("CRTEST");
        metadata.setAssigningAuthority("1.3.6.1.4.1.33349.3.1.2.99121.283");
        options.setMetadata(metadata);

        ArrayList<Name> names = new ArrayList<>();
        Name name = new Name();
        name.setFirstName("Samantha");
        name.setLastName("Richtofen");
        names.add(name);
        options.setNames(names);

        ArrayList<AlternateIdentifier> alternateIdentifiers = new ArrayList<>();

        //ThreadLocalRandom.current().setSeed(LocalDateTime.now().getNano());
        String seededStr = String.valueOf(ThreadLocalRandom.current().nextInt(100,10000));
        AlternateIdentifier alternateIdentifier1 = new AlternateIdentifier("1.3.6.1.4.1.33349.3.1.2.2016.27.02.0." + seededStr, UUID.randomUUID().toString());
        alternateIdentifiers.add(alternateIdentifier1);

        //ThreadLocalRandom.current().setSeed(LocalDateTime.now().getNano());
        seededStr = String.valueOf(ThreadLocalRandom.current().nextInt(100,10000));
        AlternateIdentifier alternateIdentifier2 = new AlternateIdentifier("1.3.6.1.4.1.33349.3.1.2.2016.27.02.1." + seededStr, UUID.randomUUID().toString());
        alternateIdentifiers.add(alternateIdentifier2);

        //ThreadLocalRandom.current().setSeed(LocalDateTime.now().getNano());
        seededStr = String.valueOf(ThreadLocalRandom.current().nextInt(100,10000));
        AlternateIdentifier alternateIdentifier3 = new AlternateIdentifier("1.3.6.1.4.1.33349.3.1.2.2016.27.02.2." + seededStr, UUID.randomUUID().toString());
        alternateIdentifiers.add(alternateIdentifier3);

        // ThreadLocalRandom.current().setSeed(LocalDateTime.now().getNano());
        seededStr = String.valueOf(ThreadLocalRandom.current().nextInt(100,10000));
        AlternateIdentifier alternateIdentifier4 = new AlternateIdentifier("1.3.6.1.4.1.33349.3.1.2.2016.27.02.3." + seededStr, UUID.randomUUID().toString());
        alternateIdentifiers.add(alternateIdentifier4);

        options.setOtherIdentifiers(alternateIdentifiers);

        options.setPersonIdentifier(UUID.randomUUID().toString());

        fhirUtility = new FhirUtility();
    }

    @Test
    void testEmptyAlternateIdentifiers(){
        options.setOtherIdentifiers(new ArrayList<AlternateIdentifier>());

        Patient actual = fhirUtility.generateCandidateRegistry(options);

        assertEquals(0, actual.getIdentifier().size());
    }

    @Test
    void testEmptyDateOfBirth() {
        options.setDateOfBirthOptions(null);

        Patient actual = fhirUtility.generateCandidateRegistry(options);

        assertNull(actual.getBirthDate());
    }

    @Test
    void testEmptyEmail() {
        Patient actual = fhirUtility.generateCandidateRegistry(options);

        assertEquals(0, actual.getTelecom().size());
    }

    @Test
    void testEmptyGender() {
        options.setGender(null);

        Patient actual = fhirUtility.generateCandidateRegistry(options);

        assertEquals(AdministrativeGenderEnum.UNKNOWN.toString(), actual.getGender().toUpperCase());
    }

    @Test
    void testEmptyName() {
        options.setNames(new ArrayList<Name>());

        Patient actual = fhirUtility.generateCandidateRegistry(options);

        assertEquals(0, actual.getName().size());
    }

    @Test
    void testEmptyPhone() {
        Patient actual = fhirUtility.generateCandidateRegistry(options);

        assertEquals(0, actual.getTelecom().size());
    }
}
