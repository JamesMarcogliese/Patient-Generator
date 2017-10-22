package messaging.model;

import ca.uhn.fhir.model.dstu2.resource.Patient;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

/**
 * Represents a generation response.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GenerationResponse {
    private ArrayList<String> messages;
    private Boolean hasErrors;
    private ArrayList<String> patients;

    /**
     * Initializes a new instance of the GenerationResponse class.
     */
    public GenerationResponse() {
        this.messages = new ArrayList<>();
        this.hasErrors = false;
        this.patients = new ArrayList<>();
    }

    /**
     * Get messages, if any.
     * @return A message.
     */
    public ArrayList<String> getMessages() {
        return messages;
    }

    /**
     * Add messages, if any.
     * @param message A message.
     */
    public void addMessage(String message) {
        this.messages.add(message);
    }

    /**
     * When true, a problem occurred when generating patients.
     * @return If a problem occurred when generating patients.
     */
    public Boolean hasErrors() {
        return hasErrors;
    }

    /**
     * When true, a problem occurred when generating patients.
     * @param hasErrors If a problem occurred when generating patients.
     */
    public void setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    /**
     * Gets the patients list.
     * @return The patients.
     */
    public ArrayList<String> getPatients() {
        return patients;
    }

    /**
     * Sets the patients list.
     * @param patients The patients.
     */
    public void setPatients(ArrayList<String> patients) {
        this.patients = patients;
    }

    /**
     * Adds a patient to the patient list.
     * @param patient The patient.
     */
    public void addPatient(String patient){
        this.patients.add(patient);
    }
}
