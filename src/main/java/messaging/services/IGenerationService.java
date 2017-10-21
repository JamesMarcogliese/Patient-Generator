package messaging.services;

import core.model.componentModel.Demographic;
import messaging.model.GenerationResponse;

/**
 * Represents a patient generation service interface.
 */
public interface IGenerationService {
    /**
     * Generates patients using the provided options.
     * @param options The options to use to generate patients.
     * @param useEndpoint If true, send to http endpoint in properties file, else, return to web service client.
     * @return Returns a GenerationResponse.
     */
    GenerationResponse generatePatientsWithOptions(Demographic options, Boolean useEndpoint);

    /**
     * Generates patients using a randomized data set.
     * @param count The number of patients to generate.
     * @param useEndpoint If true, send to http endpoint in properties file, else, return to web service client.
     * @return Returns a GenerationResponse.
     */
    GenerationResponse generatePatients(int count, Boolean useEndpoint);
}
