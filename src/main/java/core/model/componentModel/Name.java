package core.model.componentModel;

import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents name options for a patient.
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class Name {
    private String firstName;
    private String lastName;
    private List<String> middleNames;
    private String prefix;
    private List<String> suffixes;

    /**
     * Initializes a new instance of the NameOptions class.
     */
    public Name() {
        this.middleNames = new ArrayList<>();
        this.suffixes = new ArrayList<>();
    }

    /**
     * Gets the first name of the patient.
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the patient.
     * @param firstName First name of the patient.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the patient.
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the patient.
     * @param lastName Last name of the patient.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the middke name of the patient.
     * @return middleNames
     */
    public List<String> getMiddleNames() {
        return middleNames;
    }

    /**
     * Sets the middle names of the patient.
     * @param middleNames Middle names of the patient.
     */
    public void setMiddleNames(List<String> middleNames) {
        this.middleNames = middleNames;
    }

    /**
     * Gets the prefixes of the patient.
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the prefixes of the patient.
     * @param prefix Prefixes of the patient.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Gets the suffixes of the patient.
     * @return suffixes
     */
    public List<String> getSuffixes() {
        return suffixes;
    }

    /**
     * Sets the suffixes of the patient.
     * @param suffixes Suffixes of the patient.
     */
    public void setSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
    }
}
