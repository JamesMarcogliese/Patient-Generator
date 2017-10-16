package hl7v2;

import core.IHL7v2SenderService;
import core.model.common.Patient;
import core.model.componentModel.Demographic;

public class HL7v2SenderService implements IHL7v2SenderService{


    @Override
    public void send(Demographic options) {

    }

    @Override
    public void send(Iterable<Patient> patients) {

    }

    @Override
    public void send(Patient patient) {

    }

    /*@Override
    public Task sendAsync(Demographic options) {
        return null;
    }

    @Override
    public Task sendAsync(Iterable<Patient> patients) {
        return null;
    }

    @Override
    public Task sendAsync(Patient patient) {
        return null;
    }*/
}
