package core.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents metadata about patient registration.
 */
@XmlRootElement(name = "metadata")
@XmlAccessorType(XmlAccessType.FIELD)
public class Metadata {
    private String assigningAuthority;
    private String receivingApplication;
    private String receivingFacility;
    private String sendingApplication;
    private String sendingFacility;
    private Boolean useFhir;
    private Boolean useHL7v2;
    private Boolean useHL7v3;

    /**
     * Initializes a new instance of the Metadata class.
     */
    public Metadata() {
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
     * @param assigningAuthority Assigning authority.
     */
    public void setAssigningAuthority(String assigningAuthority) {
        this.assigningAuthority = assigningAuthority;
    }

    /**
     * Gets the receiving application.
     * @return receivingApplication
     */
    public String getReceivingApplication() {
        return receivingApplication;
    }

    /**
     * Sets the receiving application.
     * @param receivingApplication Recieving facility.
     */
    public void setReceivingApplication(String receivingApplication) {
        this.receivingApplication = receivingApplication;
    }

    /**
     * Gets the receiving facility.
     * @return receivingFacility
     */
    public String getReceivingFacility() {
        return receivingFacility;
    }

    /**
     * Sets the receiving facility.
     * @param receivingFacility Receiving facility.
     */
    public void setReceivingFacility(String receivingFacility) {
        this.receivingFacility = receivingFacility;
    }

    /**
     * Gets the sending application.
     * @return sendingApplication
     */
    public String getSendingApplication() {
        return sendingApplication;
    }

    /**
     * Sets the sending application.
     * @param sendingApplication Sending application.
     */
    public void setSendingApplication(String sendingApplication) {
        this.sendingApplication = sendingApplication;
    }

    /**
     * Gets the sending facility.
     * @return sendingFacility
     */
    public String getSendingFacility() {
        return sendingFacility;
    }

    /**
     * Sets the sending facility.
     * @param sendingFacility Sending facility.
     */
    public void setSendingFacility(String sendingFacility) {
        this.sendingFacility = sendingFacility;
    }

    /**
     * When true, the application will generate patients using FHIR messages.
     * @return useFhir
     */
    public Boolean useFhir() {
        return useFhir;
    }

    /**
     * Sets whether the application will generate patients using FHIR messages.
     * @param useFhir Use Fhir.
     */
    public void setUseFhir(Boolean useFhir) {
        this.useFhir = useFhir;
    }

    /**
     * When true, the application will generate patients using HL7v2 messages.
     * @return useHL7v2
     */
    public Boolean useHL7v2() {
        return useHL7v2;
    }

    /**
     * Sets whether the application will generate patients using HL7v2 messages.
     * @param useHL7v2 Use HL7v2.
     */
    public void setUseHL7v2(Boolean useHL7v2) {
        this.useHL7v2 = useHL7v2;
    }

    /**
     * When true, the application will generate patients using HL7v3 messages.
     * @return useHL7v3
     */
    public Boolean useHL7v3() {
        return useHL7v3;
    }

    /**
     * Sets whether the application will generate patients using HL7v3 messages.
     * @param useHL7v3 HL7v2.
     */
    public void setUseHL7v3(Boolean useHL7v3) {
        this.useHL7v3 = useHL7v3;
    }
}
