package messaging.model;

import ca.uhn.fhir.model.dstu2.resource.Patient;

import java.util.ArrayList;

/**
 * Represents a generation response.
 */
public class GenerationResponse {
    private  ArrayList<String> messages;
    private Boolean hasErrors;
    private ArrayList<Patient> patients;

    /**
     * Initializes a new instance of the GenerationResponse class.
     */
    public GenerationResponse() {
        this.messages = new ArrayList<String>();
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
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    /**
     * Sets the patients list.
     * @param patients The patients.
     */
    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    /**
     * Adds a patient to the patient list.
     * @param patient The patient.
     */
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }
}
