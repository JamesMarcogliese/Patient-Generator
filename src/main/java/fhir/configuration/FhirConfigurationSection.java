package fhir.configuration;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class FhirConfigurationSection {
    @XmlElement private ArrayList<FhirEndpoint> endpoints;

    public FhirConfigurationSection() {
        endpoints = new ArrayList<FhirEndpoint>();
    }

    public ArrayList<FhirEndpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(ArrayList<FhirEndpoint> endpoints) {
        this.endpoints = endpoints;
    }
}
