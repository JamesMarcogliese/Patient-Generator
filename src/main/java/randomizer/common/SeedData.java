package randomizer.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Represents common data.
 */
@XmlRootElement(name="seedData")
@XmlAccessorType(XmlAccessType.FIELD)
public class SeedData {

    @XmlElement(name="city") private ArrayList<String> cities;
    @XmlElement(name="familyName")private ArrayList<String> familyNames;
    @XmlElement(name="givenName")private ArrayList<GivenNameGenderPair> givenNames;
    @XmlElement(name="streetName")private ArrayList<String> streetNames;

    /**
     * Gets the cities.
     * @return The cities.
     */
    public ArrayList<String> getCities() {
        return cities;
    }

    /**
     * Sets the cities.
     * @param cities The cities.
     */
    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    /**
     * Gets the family names.
     * @return The family names.
     */
    public ArrayList<String> getFamilyNames() {
        return familyNames;
    }

    /**
     * Sets the family names.
     * @param familyNames The family names.
     */
    public void setFamilyNames(ArrayList<String> familyNames) {
        this.familyNames = familyNames;
    }

    /**
     * Gets the given names.
     * @return The given names.
     */
    public ArrayList<GivenNameGenderPair> getGivenNames() {
        return givenNames;
    }

    /**
     * Sets the given names.
     * @param givenNames The given names.
     */
    public void setGivenNames(ArrayList<GivenNameGenderPair> givenNames) {
        this.givenNames = givenNames;
    }

    /**
     * Gets the street names.
     * @return The street names.
     */
    public ArrayList<String> getStreetNames() {
        return streetNames;
    }

    /**
     * Sets the street names.
     * @param streetNames The street names.
     */
    public void setStreetNames(ArrayList<String> streetNames) {
        this.streetNames = streetNames;
    }
}
