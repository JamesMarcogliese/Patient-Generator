
package client.classes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.classes package. 
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

    private final static QName _GeneratePatients_QNAME = new QName("http://messageReceiver.messaging/", "generatePatients");
    private final static QName _GeneratePatientsResponse_QNAME = new QName("http://messageReceiver.messaging/", "generatePatientsResponse");
    private final static QName _Metadata_QNAME = new QName("http://messageReceiver.messaging/", "metadata");
    private final static QName _GeneratePatientsWithOptions_QNAME = new QName("http://messageReceiver.messaging/", "generatePatientsWithOptions");
    private final static QName _GeneratePatientsWithOptionsResponse_QNAME = new QName("http://messageReceiver.messaging/", "generatePatientsWithOptionsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.classes
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link GenerationResponse }
     * 
     */
    public GenerationResponse createGenerationResponse() {
        return new GenerationResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Telecommunication }
     * 
     */
    public Telecommunication createTelecommunication() {
        return new Telecommunication();
    }

    /**
     * Create an instance of {@link Demographic }
     * 
     */
    public Demographic createDemographic() {
        return new Demographic();
    }

    /**
     * Create an instance of {@link RelatedPerson }
     * 
     */
    public RelatedPerson createRelatedPerson() {
        return new RelatedPerson();
    }

    /**
     * Create an instance of {@link DateOfBirthOptions }
     * 
     */
    public DateOfBirthOptions createDateOfBirthOptions() {
        return new DateOfBirthOptions();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link AlternateIdentifier }
     * 
     */
    public AlternateIdentifier createAlternateIdentifier() {
        return new AlternateIdentifier();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratePatientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://messageReceiver.messaging/", name = "generatePatientsResponse")
    public JAXBElement<GeneratePatientsResponse> createGeneratePatientsResponse(GeneratePatientsResponse value) {
        return new JAXBElement<GeneratePatientsResponse>(_GeneratePatientsResponse_QNAME, GeneratePatientsResponse.class, null, value);
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

}
