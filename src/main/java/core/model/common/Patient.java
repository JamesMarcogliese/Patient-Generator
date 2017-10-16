package core.model.common;

import java.time.LocalDateTime;

/**
 * Represents a patient.
 */
public class Patient {
    private String addressLine;
    private String city;
    private String country;
    private LocalDateTime dateOfBirth;
    private String email;
    private String gender;
    private String firstName;
    private String middleName;
    private String lastName;
    private String healthCardNo;
    private String language;
    private String phoneNo;
    private String postalCode;
    private String province;

    /**
     * Initializes a new instance of the Patient class.
     */
    public Patient() {

    }

    /**
     * Gets the address line.
     * @return addressLine
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the address line.
     * @param addressLine Address of the patient.
     */
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * Gets the city.
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     * @param city City of the patient.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get the country.
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country.
     * @param country Country of the patient.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Get the date of birth.
     * @return dateOfBirth
     */
    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth.
     * @param dateOfBirth Date of Birth of the patient.
     */
    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Gets the email.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * @param email Email of the patient.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the gender.
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     * @param gender Gender of the patient.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the first name.
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     * @param firstName First Name of the patient.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the middle name.
     * @return middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the middle name.
     * @param middleName Middle name of the patient.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Gets the last name.
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     * @param lastName Last name of the patient.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the health card number.
     * @return healthCardNo
     */
    public String getHealthCardNo() {
        return healthCardNo;
    }

    /**
     * Sets the haalth card number.
     * @param healthCardNo Health card number of the patient.
     */
    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    /**
     * Gets the language.
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language.
     * @param language Language of the patient.
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Gets the phone number.
     * @return phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the phone number.
     * @param phoneNo Phone number of the patient.
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * Gets the postal code.
     * @return postCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code.
     * @param postalCode Postal code of the patient.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets the province.
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the province.
     * @param province Province of the patient.
     */
    public void setProvince(String province) {
        this.province = province;
    }
}
