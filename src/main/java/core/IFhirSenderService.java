package core;

import core.model.common.Patient;
import core.model.componentModel.Demographic;

import java.util.List;

/**
 * Represents a FHIR sender service.
 */
public interface IFhirSenderService {

    /**
     * Sends the specified options.
     * @param options The options.
     */
    public void sendHttp(Demographic options);

    /**
     * Sends the specified patients.
     * @param patients The patients.
     */
    public void sendHttp(Iterable<Patient> patients);

    /**
     * Sends the specified patient.
     * @param patient The patient.
     */
    public void sendHttp(Patient patient);

    /**
     * Returns the specified options.
     * @param options The options.
     * @return A Fhir patient.
     */
    public String returnSoap(Demographic options);

    /**
     * Returns the specified patients.
     * @param patients The patients.
     * @return A Fhir patient list.
     */
    public List<String> returnSoap(Iterable<Patient> patients);

    /**
     * Returns the specified patient.
     * @param patient The patient.
     * @return A Fhir patient.
     */
    public String returnSoap(Patient patient);
    //public Task sendAsync(Demographic options);
    //public Task sendAsync(Iterable<Patient> patients);
    //public void sendAsync(Patient patient);
}
