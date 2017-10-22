package core.model.componentModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents assigning authority options.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AlternateIdentifier {
    private String type;
    private String value;
    private String assigningAuthority;

    /**
     * Initializes a new instance of the AlternateIdentifier class.
     */
    public AlternateIdentifier() {
        this.type = "ISO";
    }

    /**
     * Initializes a new instance of the AlternateIdentifier class.
     * @param assigningAuthority The assigning authority. (OID)
     * @param value The value of the assigning authority.
     */
    public AlternateIdentifier(String assigningAuthority, String value){
        this.assigningAuthority = assigningAuthority;
        this.value = value;
    }

    /**
     * Gets the type of the assigning Authority. Defaults to "ISO".
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the assigning Authority.
     * @param type Type of the assigning authority.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the value of the assigning authority.
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the assigning authority.
     * @param value Value of the assigning authority.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the assigning authority.
     * @return assigningAuthority
     */
    public String getAssigningAuthority() {
        return assigningAuthority;
    }

    /**
     * Sets the assigning authority.
     * @param assigningAuthority Assigning authority of the patient.
     */
    public void setAssigningAuthority(String assigningAuthority) {
        this.assigningAuthority = assigningAuthority;
    }
}
