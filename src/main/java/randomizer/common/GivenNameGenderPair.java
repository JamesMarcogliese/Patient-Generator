package randomizer.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Represents a given name and gender pair.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GivenNameGenderPair {
    @XmlAttribute(name="gender") private String genderCode;
    @XmlAttribute private String name;

    /**
     * Gets the gender code.
     * @return The gender code.
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the gender code.
     * @param genderCode The gender code.
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * Gets the name.
     * @return The name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * @param name The name.
     */
    public void setName(String name) {
        this.name = name;
    }
}
