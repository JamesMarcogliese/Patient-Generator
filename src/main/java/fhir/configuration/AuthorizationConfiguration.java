package fhir.configuration;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="authorization")
public class AuthorizationConfiguration {
    @XmlAttribute(name="id") private String applicationId;
    @XmlAttribute(name="secret") private String applicationSecret;
    @XmlAttribute private String endpoint;
    @XmlAttribute private String password;
    @XmlAttribute private String scope;
    @XmlAttribute private String username;

    public AuthorizationConfiguration() {
    }

    public AuthorizationConfiguration(String endpoint, String applicationId, String applicationSecret){
        this.endpoint = endpoint;
        this.applicationId = applicationId;
        this.applicationSecret = applicationSecret;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationSecret() {
        return applicationSecret;
    }

    public void setApplicationSecret(String applicationSecret) {
        this.applicationSecret = applicationSecret;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
