package fhir.configuration;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

/**
 * Represents a Fhir configuration section.
 */
public class FhirConfigurationSection {
    @XmlElement private ArrayList<FhirEndpoint> endpoints;

    /**
     * Initializes a new instance of the FhirConfigurationSection class.
     */
    public FhirConfigurationSection() {
        endpoints = new ArrayList<FhirEndpoint>();
    }

    /**
     * Gets the list of endpoints for the fhir configuration section.
     * @return The endpoints.
     */
    public ArrayList<FhirEndpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * Sets the list of endpoints for the fhir configuration section.
     * @param endpoints The endpoints.
     */
    public void setEndpoints(ArrayList<FhirEndpoint> endpoints) {
        this.endpoints = endpoints;
    }
}
