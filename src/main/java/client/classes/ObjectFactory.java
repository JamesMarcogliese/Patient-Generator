
package client.classes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Demographic_QNAME = new QName("http://messageReceiver.messaging/", "demographic");
    private final static QName _RelatedPerson_QNAME = new QName("http://messageReceiver.messaging/", "relatedPerson");
    private final static QName _GeneratePatients_QNAME = new QName("http://messageReceiver.messaging/", "generatePatients");
    private final static QName _Telecommunication_QNAME = new QName("http://messageReceiver.messaging/", "telecommunication");
    private final static QName _Address_QNAME = new QName("http://messageReceiver.messaging/", "address");
    private final static QName _GeneratePatientsResponse_QNAME = new QName("http://messageReceiver.messaging/", "generatePatientsResponse");
    private final static QName _GenerationResponse_QNAME = new QName("http://messageReceiver.messaging/", "generationResponse");
    private final static QName _Metadata_QNAME = new QName("http://messageReceiver.messaging/", "metadata");
    private final static QName _GeneratePatientsWithOptions_QNAME = new QName("http://messageReceiver.messaging/", "generatePatientsWithOptions");
    private final static QName _GeneratePatientsWithOptionsResponse_QNAME = new QName("http://messageReceiver.messaging/", "generatePatientsWithOptionsResponse");
    private final static QName _AlternateIdentifier_QNAME = new QName("http://messageReceiver.messaging/", "alternateIdentifier");
    private final static QName _Name_QNAME = new QName("http://messageReceiver.messaging/", "name");
    private final static QName _DateOfBirthOptions_QNAME = new QName("http://messageReceiver.messaging/", "dateOfBirthOptions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link RelatedPerson }
     * 
     */
    public RelatedPerson createRelatedPerson() {
        return new RelatedPerson();
    }

    /**
     * Create an instance of {@link Demographic }
     * 
     */
    public Demographic createDemographic() {
        return new Demographic();
    }

    /**
     * Create an instance of {@link Telecommunication }
     * 
     */
    public Telecommunication createTelecommunication() {
        return new Telecommunication();
    }

    /**
     * Create an instance of {@link GenerationResponse }
     * 
     */
    public GenerationResponse createGenerationResponse() {
        return new GenerationResponse();
    }

    /**
     * Create an instance of {@link GeneratePatientsWithOptions }
     * 
     */
    public GeneratePatientsWithOptions createGeneratePatientsWithOptions() {
        return new GeneratePatientsWithOptions();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link GeneratePatientsResponse }
     * 
     */
    public GeneratePatientsResponse createGeneratePatientsResponse() {
        return new GeneratePatientsResponse();
    }

    /**
     * Create an instance of {@link GeneratePatientsWithOptionsResponse }
     * 
     */
    public GeneratePatientsWithOptionsResponse createGeneratePatientsWithOptionsResponse() {
        return new GeneratePatientsWithOptionsResponse();
    }

    /**
     * Create an instance of {@link GeneratePatients }
     * 
     */
    public GeneratePatients createGeneratePatients() {
        return new GeneratePatients();
    }

    /**
     * Create an instance of {@link DateOfBirthOptions }
     * 
     */
    public DateOfBirthOptions createDateOfBirthOptions() {
        return new DateOfBirthOptions();
    }

    /**
     * Create an instance of {@link AlternateIdentifier }
     * 
     */
    public AlternateIdentifier createAlternateIdentifier() {
        return new AlternateIdentifier();
    }

    /**
     * Create an instance of {@link Name.MiddleNames }
     * 
     */
    public Name.MiddleNames createNameMiddleNames() {
        return new Name.MiddleNames();
    }

    /**
     * Create an instance of {@link Name.Suffixes }
     * 
     */
    public Name.Suffixes createNameSuffixes() {
        return new Name.Suffixes();
    }

    /**
     * Create an instance of {@link RelatedPerson.Addresses }
     * 
     */
    public RelatedPerson.Addresses createRelatedPersonAddresses() {
        return new RelatedPerson.Addresses();
    }

    /**
     * Create an instance of {@link RelatedPerson.Names }
     * 
     */
    public RelatedPerson.Names createRelatedPersonNames() {
        return new RelatedPerson.Names();
    }

    /**
     * Create an instance of {@link Demographic.Addresses }
     * 
     */
    public Demographic.Addresses createDemographicAddresses() {
        return new Demographic.Addresses();
    }

    /**
     * Create an instance of {@link Demographic.Names }
     * 
     */
    public Demographic.Names createDemographicNames() {
        return new Demographic.Names();
    }

    /**
     * Create an instance of {@link Demographic.OtherIdentifiers }
     * 
     */
    public Demographic.OtherIdentifiers createDemographicOtherIdentifiers() {
        return new Demographic.OtherIdentifiers();
    }

    /**
     * Create an instance of {@link Demographic.RelatedPersons }
     * 
     */
    public Demographic.RelatedPersons createDemographicRelatedPersons() {
        return new Demographic.RelatedPersons();
    }

    /**
     * Create an instance of {@link Telecommunication.EmailAddresses }
     * 
     */
    public Telecommunication.EmailAddresses createTelecommunicationEmailAddresses() {
        return new Telecommunication.EmailAddresses();
    }

    /**
     * Create an instance of {@link Telecommunication.PhoneNumbers }
     * 
     */
    public Telecommunication.PhoneNumbers createTelecommunicationPhoneNumbers() {
        return new Telecommunication.PhoneNumbers();
    }

    /**
     * Create an instance of {@link GenerationResponse.Messages }
     * 
     */
    public GenerationResponse.Messages createGenerationResponseMessages() {
        return new GenerationResponse.Messages();
    }

    /**
     * Create an instance of {@link GenerationResponse.Patients }
     * 
     */
    public GenerationResponse.Patients createGenerationResponsePatients() {
        return new GenerationResponse.Patients();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Demographic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "demographic")
    public JAXBElement<Demographic> createDemographic(Demographic value) {
        return new JAXBElement<Demographic>(_Demographic_QNAME, Demographic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "relatedPerson")
    public JAXBElement<RelatedPerson> createRelatedPerson(RelatedPerson value) {
        return new JAXBElement<RelatedPerson>(_RelatedPerson_QNAME, RelatedPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratePatients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "generatePatients")
    public JAXBElement<GeneratePatients> createGeneratePatients(GeneratePatients value) {
        return new JAXBElement<GeneratePatients>(_GeneratePatients_QNAME, GeneratePatients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Telecommunication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "telecommunication")
    public JAXBElement<Telecommunication> createTelecommunication(Telecommunication value) {
        return new JAXBElement<Telecommunication>(_Telecommunication_QNAME, Telecommunication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratePatientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "generatePatientsResponse")
    public JAXBElement<GeneratePatientsResponse> createGeneratePatientsResponse(GeneratePatientsResponse value) {
        return new JAXBElement<GeneratePatientsResponse>(_GeneratePatientsResponse_QNAME, GeneratePatientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "generationResponse")
    public JAXBElement<GenerationResponse> createGenerationResponse(GenerationResponse value) {
        return new JAXBElement<GenerationResponse>(_GenerationResponse_QNAME, GenerationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Metadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "metadata")
    public JAXBElement<Metadata> createMetadata(Metadata value) {
        return new JAXBElement<Metadata>(_Metadata_QNAME, Metadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratePatientsWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "generatePatientsWithOptions")
    public JAXBElement<GeneratePatientsWithOptions> createGeneratePatientsWithOptions(GeneratePatientsWithOptions value) {
        return new JAXBElement<GeneratePatientsWithOptions>(_GeneratePatientsWithOptions_QNAME, GeneratePatientsWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratePatientsWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "generatePatientsWithOptionsResponse")
    public JAXBElement<GeneratePatientsWithOptionsResponse> createGeneratePatientsWithOptionsResponse(GeneratePatientsWithOptionsResponse value) {
        return new JAXBElement<GeneratePatientsWithOptionsResponse>(_GeneratePatientsWithOptionsResponse_QNAME, GeneratePatientsWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "alternateIdentifier")
    public JAXBElement<AlternateIdentifier> createAlternateIdentifier(AlternateIdentifier value) {
        return new JAXBElement<AlternateIdentifier>(_AlternateIdentifier_QNAME, AlternateIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "name")
    public JAXBElement<Name> createName(Name value) {
        return new JAXBElement<Name>(_Name_QNAME, Name.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateOfBirthOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "dateOfBirthOptions")
    public JAXBElement<DateOfBirthOptions> createDateOfBirthOptions(DateOfBirthOptions value) {
        return new JAXBElement<DateOfBirthOptions>(_DateOfBirthOptions_QNAME, DateOfBirthOptions.class, null, value);
    }

}
