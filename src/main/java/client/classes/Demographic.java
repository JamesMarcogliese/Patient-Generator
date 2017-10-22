
package client.classes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for demographic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="demographic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresses" type="{http://messageReceiver.messaging/}address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateOfBirthOptions" type="{http://messageReceiver.messaging/}dateOfBirthOptions" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://messageReceiver.messaging/}metadata" minOccurs="0"/>
 *         &lt;element name="names" type="{http://messageReceiver.messaging/}name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherIdentifiers" type="{http://messageReceiver.messaging/}alternateIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedPersons" type="{http://messageReceiver.messaging/}relatedPerson" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telecomOptions" type="{http://messageReceiver.messaging/}telecommunication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demographic", propOrder = {
    "addresses",
    "dateOfBirthOptions",
    "gender",
    "metadata",
    "names",
    "otherIdentifiers",
    "personIdentifier",
    "relatedPersons",
    "telecomOptions"
})
public class Demographic {

    @XmlElement(nillable = true)
    protected List<Address> addresses;
    protected DateOfBirthOptions dateOfBirthOptions;
    protected String gender;
    protected Metadata metadata;
    @XmlElement(nillable = true)
    protected List<Name> names;
    @XmlElement(nillable = true)
    protected List<AlternateIdentifier> otherIdentifiers;
    protected String personIdentifier;
    @XmlElement(nillable = true)
    protected List<RelatedPerson> relatedPersons;
    protected Telecommunication telecomOptions;

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<Address>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the dateOfBirthOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DateOfBirthOptions }
     *     
     */
    public DateOfBirthOptions getDateOfBirthOptions() {
        return dateOfBirthOptions;
    }

    /**
     * Sets the value of the dateOfBirthOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOfBirthOptions }
     *     
     */
    public void setDateOfBirthOptions(DateOfBirthOptions value) {
        this.dateOfBirthOptions = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link Metadata }
     *     
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata }
     *     
     */
    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getNames() {
        if (names == null) {
            names = new ArrayList<Name>();
        }
        return this.names;
    }

    /**
     * Gets the value of the otherIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateIdentifier }
     * 
     * 
     */
    public List<AlternateIdentifier> getOtherIdentifiers() {
        if (otherIdentifiers == null) {
            otherIdentifiers = new ArrayList<AlternateIdentifier>();
        }
        return this.otherIdentifiers;
    }

    /**
     * Gets the value of the personIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonIdentifier() {
        return personIdentifier;
    }

    /**
     * Sets the value of the personIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonIdentifier(String value) {
        this.personIdentifier = value;
    }

    /**
     * Gets the value of the relatedPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedPerson }
     * 
     * 
     */
    public List<RelatedPerson> getRelatedPersons() {
        if (relatedPersons == null) {
            relatedPersons = new ArrayList<RelatedPerson>();
        }
        return this.relatedPersons;
    }

    /**
     * Gets the value of the telecomOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Telecommunication }
     *     
     */
    public Telecommunication getTelecomOptions() {
        return telecomOptions;
    }

    /**
     * Sets the value of the telecomOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telecommunication }
     *     
     */
    public void setTelecomOptions(Telecommunication value) {
        this.telecomOptions = value;
    }

}
