package fhir;

import ca.uhn.fhir.model.dstu2.resource.Patient;
import core.IFhirSenderService;
import core.model.Metadata;
import core.model.componentModel.Demographic;

/**
 * Represents a FHIR sender service.
 */
public class FhirSenderService implements IFhirSenderService {

    @Override
    public void send(Demographic options) {

        FhirUtility fhirUtility = new FhirUtility();
        Patient patient = fhirUtility.generateCandidateRegistry(options);
        fhirUtility.sendFhirMessages(patient);
    }

    @Override
    public void send(Iterable<core.model.common.Patient> patients) {

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

    @Override
    public void send(core.model.common.Patient patient) {

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
