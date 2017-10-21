package messaging.messageReceiver;

import core.model.common.Patient;
import core.model.componentModel.Demographic;
import core.validation.ResultDetail;
import core.validation.ResultDetailType;
import fhir.FhirSenderService;
import messaging.model.GenerationResponse;
import messaging.services.IGenerationService;
import messaging.validation.ValidationUtil;
import randomizer.RandomizerService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Provides operations to generate patients.
 */
@WebService(serviceName = "generationService")
public class GenerationService implements IGenerationService {
    private FhirSenderService fhirSenderService;
    //private HL7v2SenderService hl7v2SenderService;
    //private HL7v3SenderService hl7v3SenderService;
    private RandomizerService randomizerService;

    /**
     * Initializes a new instance of the GenerationService class.
     */
    public GenerationService() {
        fhirSenderService = new FhirSenderService();
        //hl7v2SenderService = new HL7v2SenderService();
        //hl7v3SenderService = new HL7v3SenderService();
        randomizerService = new RandomizerService();
    }

    /**
     * Generates patients using the provided options.
     * @param options The options to use to generate patients.
     * @param useEndpoint If true, send to http endpoint in properties file, else, return to web service client.
     * @return Returns a GenerationResponse.
     */
    @WebMethod
    @Override
    public GenerationResponse generatePatientsWithOptions(Demographic options, Boolean useEndpoint){
        GenerationResponse response = new GenerationResponse();

        ValidationUtil validationUtil = new ValidationUtil();
        Iterable<ResultDetail> details = validationUtil.validateMessage(options);

        for (ResultDetail currentResultDetail : details) {
            if (currentResultDetail.getType() == ResultDetailType.Error) {
                response.setHasErrors(true);
                response.addMessage(currentResultDetail.getMessage());
            }
        }

        if (!response.hasErrors()){

            if (fhirSenderService != null && useEndpoint) {

                fhirSenderService.sendHttp(options);

            } else if (fhirSenderService != null){

                response.addPatient(fhirSenderService.returnSoap(options));
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

    /**
     * Generates patients using a randomized data set.
     * @param count The number of patients to generate.
     * @param useEndpoint If true, send to http endpoint in properties file, else, return to web service client.
     * @return Returns a generation response.
     */
    @WebMethod
    @Override
    public GenerationResponse generatePatients(int count, Boolean useEndpoint){
        GenerationResponse response = new GenerationResponse();

        ArrayList<Patient> patients = new ArrayList<Patient>();

        for (int i = 0; i < count; i++){
            patients.add(randomizerService.getRandomPatient());
        }

        for (Patient currentPatient : patients) {

            if (fhirSenderService != null && useEndpoint) {

                fhirSenderService.sendHttp(currentPatient);

            } else if (fhirSenderService != null){

                response.addPatient(fhirSenderService.returnSoap(currentPatient));
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
