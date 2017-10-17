package fhir.configuration;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents a FHIR endpoint.
 */
@XmlRootElement(name="endpoint")
public class FhirEndpoint {
    @XmlAttribute private String address;
    @XmlAttribute private String name;
    @XmlAttribute private Boolean requiresAuthorization;
    @XmlElement(name="authorization") private AuthorizationConfiguration authorizationConfiguration;

    /**
     * Initializes a new instance of the FhirEndpoint class.
     */
    public FhirEndpoint() {
    }

    /**
     * Gets the address.
     * @return The address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     * @param address The address.
     */
    public void setAddress(String address) {
        this.address = address;
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

    /**
     * Gets a value indicating whether requires authorization.
     * @return Value indicating whether requires authorization.
     */
    public Boolean getRequiresAuthorization() {
        return requiresAuthorization;
    }

    /**
     * Sets a value indicating whether requires authorization.
     * @param requiresAuthorization True if requires authorization, otherwise, false.
     */
    public void setRequiresAuthorization(Boolean requiresAuthorization) {
        this.requiresAuthorization = requiresAuthorization;
    }

    /**
     * Gets the authorization configuration.
     * @return The authorization configuration.
     */
    public AuthorizationConfiguration getAuthorizationConfiguration() {
        return authorizationConfiguration;
    }

    /**
     * Sets the authorization configuration.
     * @param authorizationConfiguration The authorization configuration.
     */
    public void setAuthorizationConfiguration(AuthorizationConfiguration authorizationConfiguration) {
        this.authorizationConfiguration = authorizationConfiguration;
    }

    /**
     * Returns the name and address in a string representation.
     * @return String representation of name and address.
     */
    @Override
    public String toString() {
        return name + " " + address;
    }
}
