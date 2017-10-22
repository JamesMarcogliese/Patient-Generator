
package client.classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assigningAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivingApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivingFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendingApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendingFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useFhir" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useHL7v2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useHL7v3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadata", propOrder = {
    "assigningAuthority",
    "receivingApplication",
    "receivingFacility",
    "sendingApplication",
    "sendingFacility",
    "useFhir",
    "useHL7V2",
    "useHL7V3"
})
public class Metadata {

    protected String assigningAuthority;
    protected String receivingApplication;
    protected String receivingFacility;
    protected String sendingApplication;
    protected String sendingFacility;
    protected Boolean useFhir;
    @XmlElement(name = "useHL7v2")
    protected Boolean useHL7V2;
    @XmlElement(name = "useHL7v3")
    protected Boolean useHL7V3;

    /**
     * Gets the value of the assigningAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigningAuthority() {
        return assigningAuthority;
    }

    /**
     * Sets the value of the assigningAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigningAuthority(String value) {
        this.assigningAuthority = value;
    }

    /**
     * Gets the value of the receivingApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingApplication() {
        return receivingApplication;
    }

    /**
     * Sets the value of the receivingApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingApplication(String value) {
        this.receivingApplication = value;
    }

    /**
     * Gets the value of the receivingFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingFacility() {
        return receivingFacility;
    }

    /**
     * Sets the value of the receivingFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingFacility(String value) {
        this.receivingFacility = value;
    }

    /**
     * Gets the value of the sendingApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingApplication() {
        return sendingApplication;
    }

    /**
     * Sets the value of the sendingApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingApplication(String value) {
        this.sendingApplication = value;
    }

    /**
     * Gets the value of the sendingFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingFacility() {
        return sendingFacility;
    }

    /**
     * Sets the value of the sendingFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingFacility(String value) {
        this.sendingFacility = value;
    }

    /**
     * Gets the value of the useFhir property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseFhir() {
        return useFhir;
    }

    /**
     * Sets the value of the useFhir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFhir(Boolean value) {
        this.useFhir = value;
    }

    /**
     * Gets the value of the useHL7V2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseHL7V2() {
        return useHL7V2;
    }

    /**
     * Sets the value of the useHL7V2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseHL7V2(Boolean value) {
        this.useHL7V2 = value;
    }

    /**
     * Gets the value of the useHL7V3 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseHL7V3() {
        return useHL7V3;
    }

    /**
     * Sets the value of the useHL7V3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseHL7V3(Boolean value) {
        this.useHL7V3 = value;
    }

}
