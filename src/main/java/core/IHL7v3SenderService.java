package core;

import core.model.common.Patient;
import core.model.componentModel.Demographic;

/**
 * Represents a service to send HL7v3 messages.
 */
public interface IHL7v3SenderService {
    /**
     * Sends the specified options.
     * @param options The options.
     */
    public void send(Demographic options);
    /**
     * Sends the specified patients.
     * @param patients The patients.
     */
    public void send(Iterable<Patient> patients);
    /**
     * Sends the specified patient.
     * @param patient The patient.
     */
    public void send(Patient patient);
    //public Task sendAsync(Demographic options);
    //public Task sendAsync(Iterable<Patient> patients);
    //public Task sendAsync(Patient patient);
}
