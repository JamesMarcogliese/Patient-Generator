package fhir.configuration;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Represents authorization configuration.
 */
@XmlType(name="authorization")
public class AuthorizationConfiguration {
    @XmlAttribute(name="id") private String applicationId;
    @XmlAttribute(name="secret") private String applicationSecret;
    @XmlAttribute private String endpoint;
    @XmlAttribute private String password;
    @XmlAttribute private String scope;
    @XmlAttribute private String username;

    /**
     * Initializes a new instance of the AuthorizationConfiguration class.
     */
    public AuthorizationConfiguration() {
    }

    /**
     * Initializes a new instance of the AuthorizationConfiguration class.
     * @param endpoint The authorization endpoint.
     * @param applicationId the application identifier.
     * @param applicationSecret The application secret.
     */
    public AuthorizationConfiguration(String endpoint, String applicationId, String applicationSecret){
        this.endpoint = endpoint;
        this.applicationId = applicationId;
        this.applicationSecret = applicationSecret;
    }

    /**
     * Gets the application identifier.
     * @return The application id.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the application identifier.
     * @param applicationId The application id.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Gets the application secret.
     * @return The application secret.
     */
    public String getApplicationSecret() {
        return applicationSecret;
    }

    /**
     * Sets the application secret.
     * @param applicationSecret The application secret.
     */
    public void setApplicationSecret(String applicationSecret) {
        this.applicationSecret = applicationSecret;
    }

    /**
     * Gets the authorization endpoint.
     * @return The authorization endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the authorization endpoint.
     * @param endpoint The authorization endpoint
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Gets the password.
     * @return The password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * @param password The password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the scope.
     * @return The scope.
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the scope.
     * @param scope The scope.
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * Gets the username.
     * @return The username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     * @param username The username.
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
