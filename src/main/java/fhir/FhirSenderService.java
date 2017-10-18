package fhir;

import ca.uhn.fhir.model.dstu2.resource.Patient;
import core.IFhirSenderService;
import core.model.Metadata;
import core.model.componentModel.Demographic;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a FHIR sender service.
 * @see core.IFhirSenderService
 */
public class FhirSenderService implements IFhirSenderService {

    /**
     * Sends the specified options.
     * @param options The options.
     */
    @Override
    public void sendHttp(Demographic options) {

        FhirUtility fhirUtility = new FhirUtility();
        Patient patient = fhirUtility.generateCandidateRegistry(options);
        fhirUtility.sendFhirMessages(patient);
    }

    /**
     * Sends the specified patients.
     * @param patients The patients.
     */
    @Override
    public void sendHttp(Iterable<core.model.common.Patient> patients) {

        FhirUtility fhirUtility = new FhirUtility();
        Metadata metadata = new Metadata();
        metadata.setAssigningAuthority("0.0.0.0"); //FILL
        metadata.setReceivingApplication("Endpoint"); //FILL
        metadata.setReceivingFacility("Endpoint"); //FILL
        metadata.setSendingApplication("Test");
        metadata.setSendingFacility("Test");

        for (core.model.common.Patient currentPatient : patients) {
            Patient fhirPatient = fhirUtility.generateCandidateRegistry(currentPatient, metadata);
            fhirUtility.sendFhirMessages(fhirPatient);
        }
    }

    /**
     * Sends the specified patient.
     * @param patient The patient.
     */
    @Override
    public void sendHttp(core.model.common.Patient patient) {

        FhirUtility fhirUtility = new FhirUtility();
        Metadata metadata = new Metadata();
        metadata.setAssigningAuthority("0.0.0.0"); //FILL
        metadata.setReceivingApplication("Endpoint"); //FILL
        metadata.setReceivingFacility("Endpoint"); //FILL
        metadata.setSendingApplication("Test");
        metadata.setSendingFacility("Test");

        Patient fhirPatient = fhirUtility.generateCandidateRegistry(patient, metadata);
        fhirUtility.sendFhirMessages(fhirPatient);
    }

    /**
     * Returns the specified options.
     * @param options The options.
     * @return A Fhir patient.
     */
    @Override
    public Patient returnSoap(Demographic options) {

        FhirUtility fhirUtility = new FhirUtility();
        return fhirUtility.generateCandidateRegistry(options);
    }

    /**
     * Returns the specified patients.
     * @param patients The patients.
     * @return A Fhir patient list.
     */
    @Override
    public List<Patient> returnSoap(Iterable<core.model.common.Patient> patients) {

        FhirUtility fhirUtility = new FhirUtility();
        ArrayList<Patient> arr = new ArrayList<>();
        Metadata metadata = new Metadata();
        metadata.setAssigningAuthority("0.0.0.0"); //FILL
        metadata.setReceivingApplication("Endpoint"); //FILL
        metadata.setReceivingFacility("Endpoint"); //FILL
        metadata.setSendingApplication("Test");
        metadata.setSendingFacility("Test");

        for (core.model.common.Patient currentPatient : patients) {

            arr.add(fhirUtility.generateCandidateRegistry(currentPatient, metadata));
        }

        return arr;
    }

    /**
     * Returns the specified patient.
     * @param patient The patient.
     * @return A Fhir patient.
     */
    @Override
    public Patient returnSoap(core.model.common.Patient patient) {

        FhirUtility fhirUtility = new FhirUtility();
        Metadata metadata = new Metadata();
        metadata.setAssigningAuthority("0.0.0.0"); //FILL
        metadata.setReceivingApplication("Endpoint"); //FILL
        metadata.setReceivingFacility("Endpoint"); //FILL
        metadata.setSendingApplication("Test");
        metadata.setSendingFacility("Test");

        return fhirUtility.generateCandidateRegistry(patient, metadata);
    }

    /*    @Override
    public Task sendAsync(Demographic options) {

    return null;
    }

    @Override
    public Task sendAsync(Iterable<Patient> patients) {
        throw new NotImplementedException();
    }

    @Override
    public Task sendAsync(Patient patient) {
        throw new NotImplementedException();
    }*/
}
