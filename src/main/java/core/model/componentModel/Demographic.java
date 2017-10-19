package core.model.componentModel;

import core.model.Metadata;

import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents demographic options for a patient.
 */
@XmlRootElement(name = "demographic")
@XmlAccessorType(XmlAccessType.FIELD)
public class Demographic {
    @XmlElementWrapper(name = "addresses")
    @XmlElement(name = "address")
    private List<Address> addresses;
    private DateOfBirthOptions dateOfBirthOptions;
    private String gender;
    private Metadata metadata;
    @XmlElementWrapper(name = "names")
    @XmlElement(name = "name")
    private List<Name> names;
    @XmlElementWrapper(name = "otherIdentifiers")
    @XmlElement(name = "otherIdentifier")
    private List<AlternateIdentifier> otherIdentifiers;
    private String personIdentifier;
    @XmlElementWrapper(name = "relatedPersons")
    @XmlElement(name = "relatedPerson")
    private List<RelatedPerson> relatedPersons;
    private Telecommunication telecomOptions;

    /**
     * Initializes a new instance of the Demographic options class.
     */
    public Demographic() {
        this.addresses = new ArrayList<>();
        this.dateOfBirthOptions = new DateOfBirthOptions();
        this.names = new ArrayList<>();
        this.otherIdentifiers = new ArrayList<>();
        this.relatedPersons = new ArrayList<>();
        this.telecomOptions = new Telecommunication();
    }

    /**
     * Gets the address options for a patient.
     * @return addresses
     */
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Sets the address options for a patient.
     * @param addresses Address options for a patient.
     */
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    /**
     * Gets the date of birth options for a patient.
     * @return dateOfBirthOptions
     */
    public DateOfBirthOptions getDateOfBirthOptions() {
        return dateOfBirthOptions;
    }

    /**
     * Sets the date of birth options for a patient.
     * @param dateOfBirthOptions Date of birth options for a patient.
     */
    public void setDateOfBirthOptions(DateOfBirthOptions dateOfBirthOptions) {
        this.dateOfBirthOptions = dateOfBirthOptions;
    }

    /**
     * Gets the gender options for a patient.
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender options for a patient.
     * @param gender Gender options for a patient.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the metadata options for a patient.
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the metadata options for a patient.
     * @param metadata Metadata options for a patient.
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Gets the name options for a patient.
     * @return names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Sets the name options for a patient.
     * @param names Names of a patient.
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Gets the other identifiers options for a patient.
     * @return otherIdentifiers
     */
    public List<AlternateIdentifier> getOtherIdentifiers() {
        return otherIdentifiers;
    }

    /**
     * Sets the other identifiers options for a patient.
     * @param otherIdentifiers Other identifiers of a patient.
     */
    public void setOtherIdentifiers(ArrayList<AlternateIdentifier> otherIdentifiers) {
        this.otherIdentifiers = otherIdentifiers;
    }

    /**
     * Gets the person identifier options for a patient.
     * @return personIdentifier
     */
    public String getPersonIdentifier() {
        return personIdentifier;
    }

    /**
     * Sets the person identifier options for a patient.
     * @param personIdentifier Person identifier for a patient.
     */
    public void setPersonIdentifier(String personIdentifier) {
        this.personIdentifier = personIdentifier;
    }

    /**
     * Gets the related persons options for a patient.
     * @return relatedPersons
     */
    public List<RelatedPerson> getRelatedPersons() {
        return relatedPersons;
    }

    /**
     * Sets the related persons options for a patient.
     * @param relatedPersons Related Options for a patient.
     */
    public void setRelatedPersons(List<RelatedPerson> relatedPersons) {
        this.relatedPersons = relatedPersons;
    }

    /**
     * Gets the telecom options for a patient.
     * @return telecomOptions
     */
    public Telecommunication getTelecomOptions() {
        return telecomOptions;
    }

    /**
     * Sets the telecom options for a patient.
     * @param telecomOptions Telecom options for a patient.
     */
    public void setTelecomOptions(Telecommunication telecomOptions) {
        this.telecomOptions = telecomOptions;
    }
}
