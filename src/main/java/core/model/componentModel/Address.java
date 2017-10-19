package core.model.componentModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents address options for a patient.
 */
@XmlRootElement(name = "address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
    private String city;
    private String country;
    private String stateProvince;
    private String streetAddress;
    private String zipPostalCode;

    /**
     * Initializes a new instance of the Address class.
     */
    public Address() {
    }

    /**
     * Gets the city of the patient's address.
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the patient's address.
     * @param city City of the patient's address's address.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the country of the patient's address
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country of the patient's address.
     * @param country Country of the patient's address.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the State/Province of the patient's address.
     * @return stateProvince
     */
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the State/Province of the patient's address.
     * @param stateProvince State/Province of the patient's address.
     */
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    /**
     * Gets the street address of the patient's address.
     * @return streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the street address of the patient's address.
     * @param streetAddress Street Address of the patient's address.
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    /**
     * Gets the zip/postal code of the patient's address.
     * @return zipPostalCode
     */
    public String getZipPostalCode() {
        return zipPostalCode;
    }

    /**
     * Sets the zip/postal code of the patient's address.
     * @param zipPostalCode Zip/Postal Code of the patient's address.
     */
    public void setZipPostalCode(String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }
}
