package messaging.messageReceiver;

import core.*;
import core.model.common.Patient;
import core.model.componentModel.Demographic;
import core.validation.IResultDetail;
import core.validation.ResultDetail;
import core.validation.ResultDetailType;
import fhir.FhirSenderService;
import messaging.model.GenerationResponse;
import messaging.services.IGenerationService;
import messaging.validation.ValidationUtil;
import randomizer.RandomizerService;

import java.util.ArrayList;
import java.util.Iterator;

public class GenerationService implements IGenerationService {
    private FhirSenderService fhirSenderService;
    //private HL7v2SenderService hl7v2SenderService;
    //private HL7v3SenderService hl7v3SenderService;
    //private PersistenceService persistenceService;
    private RandomizerService randomizerService;

    public GenerationService() {
        fhirSenderService = new FhirSenderService();
        //hl7v2SenderService = new HL7v2SenderService();
        //hl7v3SenderService = new HL7v3SenderService();
        //persistenceService = new PersistenceService();
        randomizerService = new RandomizerService();
    }

    @Override
    public GenerationResponse generatePatients(Demographic options){
        GenerationResponse response = new GenerationResponse();

        ValidationUtil validationUtil = new ValidationUtil();
        Iterable<ResultDetail> details = validationUtil.validateMessage(options);

        for (Iterator<ResultDetail> i = details.iterator(); i.hasNext(); ){
            ResultDetail currentResultDetail = i.next();

            if(currentResultDetail.getType() == ResultDetailType.Error){
                response.setHasErrors(true);
                response.addMessage(currentResultDetail.getMessage());
            }
        }

        if (!response.hasErrors()){

            /*if(persistenceService != null) {

                persistenceService.save(options);
            }*/
            if (fhirSenderService != null) {

                fhirSenderService.send(options);
            }
           /* if (hl7v2SenderService != null)
            {
                hl7v2SenderService.send(i.next());
            }
            if (hl7v3SenderService != null)
            {
                hl7v3SenderService.send(i.next());
            }*/
        }

        return response;
    }

    @Override
    public GenerationResponse generatePatients(int count){
        GenerationResponse response = new GenerationResponse();

        ArrayList<Patient> patients = new ArrayList<Patient>();

        for (int i = 0; i < count; i++){
            patients.add(randomizerService.getRandomPatient());
        }

        for (Iterator<Patient> i = patients.iterator(); i.hasNext();){
            Patient currentPatient = i.next();

            if (fhirSenderService != null)
            {
                fhirSenderService.send(currentPatient);
            }
           /* if (hl7v2SenderService != null)
            {
                hl7v2SenderService.send(i.next());
            }
            if (hl7v3SenderService != null)
            {
                hl7v3SenderService.send(i.next());
            }*/
        }
        return response;
    }
}
