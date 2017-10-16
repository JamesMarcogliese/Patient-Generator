package randomizer.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="seedData")
@XmlAccessorType(XmlAccessType.FIELD)
public class SeedData {

    @XmlElement(name="city") private ArrayList<String> cities;
    @XmlElement(name="familyName")private ArrayList<String> familyNames;
    @XmlElement(name="givenName")private ArrayList<GivenNameGenderPair> givenNames;
    @XmlElement(name="streetName")private ArrayList<String> streetNames;

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    public ArrayList<String> getFamilyNames() {
        return familyNames;
    }

    public void setFamilyNames(ArrayList<String> familyNames) {
        this.familyNames = familyNames;
    }

    public ArrayList<GivenNameGenderPair> getGivenNames() {
        return givenNames;
    }

    public void setGivenNames(ArrayList<GivenNameGenderPair> givenNames) {
        this.givenNames = givenNames;
    }

    public ArrayList<String> getStreetNames() {
        return streetNames;
    }

    public void setStreetNames(ArrayList<String> streetNames) {
        this.streetNames = streetNames;
    }
}
