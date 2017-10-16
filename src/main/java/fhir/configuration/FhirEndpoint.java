package fhir.configuration;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="endpoint")
public class FhirEndpoint {
    @XmlAttribute private String address;
    @XmlAttribute private String name;
    @XmlAttribute private Boolean requiresAuthorization;
    @XmlElement(name="authorization") private AuthorizationConfiguration authorizationConfiguration;

    public FhirEndpoint() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRequiresAuthorization() {
        return requiresAuthorization;
    }

    public void setRequiresAuthorization(Boolean requiresAuthorization) {
        this.requiresAuthorization = requiresAuthorization;
    }

    public AuthorizationConfiguration getAuthorizationConfiguration() {
        return authorizationConfiguration;
    }

    public void setAuthorizationConfiguration(AuthorizationConfiguration authorizationConfiguration) {
        this.authorizationConfiguration = authorizationConfiguration;
    }

    @Override
    public String toString() {
        return name + " " + address;
    }
}
