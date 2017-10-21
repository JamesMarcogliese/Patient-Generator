
package client.classes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="addresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="address" type="{http://messageReceiver.messaging/}address" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dateOfBirthOptions" type="{http://messageReceiver.messaging/}dateOfBirthOptions" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://messageReceiver.messaging/}metadata" minOccurs="0"/>
 *         &lt;element name="names" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://messageReceiver.messaging/}name" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="otherIdentifiers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="otherIdentifier" type="{http://messageReceiver.messaging/}alternateIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="personIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedPersons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="relatedPerson" type="{http://messageReceiver.messaging/}relatedPerson" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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

    protected Demographic.Addresses addresses;
    protected DateOfBirthOptions dateOfBirthOptions;
    protected String gender;
    protected Metadata metadata;
    protected Demographic.Names names;
    protected Demographic.OtherIdentifiers otherIdentifiers;
    protected String personIdentifier;
    protected Demographic.RelatedPersons relatedPersons;
    protected Telecommunication telecomOptions;

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link Demographic.Addresses }
     *     
     */
    public Demographic.Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demographic.Addresses }
     *     
     */
    public void setAddresses(Demographic.Addresses value) {
        this.addresses = value;
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
     * @return
     *     possible object is
     *     {@link Demographic.Names }
     *     
     */
    public Demographic.Names getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demographic.Names }
     *     
     */
    public void setNames(Demographic.Names value) {
        this.names = value;
    }

    /**
     * Gets the value of the otherIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Demographic.OtherIdentifiers }
     *     
     */
    public Demographic.OtherIdentifiers getOtherIdentifiers() {
        return otherIdentifiers;
    }

    /**
     * Sets the value of the otherIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demographic.OtherIdentifiers }
     *     
     */
    public void setOtherIdentifiers(Demographic.OtherIdentifiers value) {
        this.otherIdentifiers = value;
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
     * @return
     *     possible object is
     *     {@link Demographic.RelatedPersons }
     *     
     */
    public Demographic.RelatedPersons getRelatedPersons() {
        return relatedPersons;
    }

    /**
     * Sets the value of the relatedPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demographic.RelatedPersons }
     *     
     */
    public void setRelatedPersons(Demographic.RelatedPersons value) {
        this.relatedPersons = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="address" type="{http://messageReceiver.messaging/}address" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "address"
    })
    public static class Addresses {

        protected List<Address> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Address }
         * 
         * 
         */
        public List<Address> getAddress() {
            if (address == null) {
                address = new ArrayList<Address>();
            }
            return this.address;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://messageReceiver.messaging/}name" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class Names {

        protected List<Name> name;

        /**
         * Gets the value of the name property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the name property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Name }
         * 
         * 
         */
        public List<Name> getName() {
            if (name == null) {
                name = new ArrayList<Name>();
            }
            return this.name;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="otherIdentifier" type="{http://messageReceiver.messaging/}alternateIdentifier" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherIdentifier"
    })
    public static class OtherIdentifiers {

        protected List<AlternateIdentifier> otherIdentifier;

        /**
         * Gets the value of the otherIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AlternateIdentifier }
         * 
         * 
         */
        public List<AlternateIdentifier> getOtherIdentifier() {
            if (otherIdentifier == null) {
                otherIdentifier = new ArrayList<AlternateIdentifier>();
            }
            return this.otherIdentifier;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="relatedPerson" type="{http://messageReceiver.messaging/}relatedPerson" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "relatedPerson"
    })
    public static class RelatedPersons {

        protected List<RelatedPerson> relatedPerson;

        /**
         * Gets the value of the relatedPerson property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedPerson property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedPerson().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelatedPerson }
         * 
         * 
         */
        public List<RelatedPerson> getRelatedPerson() {
            if (relatedPerson == null) {
                relatedPerson = new ArrayList<RelatedPerson>();
            }
            return this.relatedPerson;
        }

    }

}
