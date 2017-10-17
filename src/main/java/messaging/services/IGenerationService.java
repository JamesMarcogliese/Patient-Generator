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
     * @return Returns a GenerationResponse.
     */
    public GenerationResponse generatePatients(Demographic options);

    /**
     * Generates patients using a randomized dataset.
     * @param count The number of patients to generate.
     * @return Returns a GenerationResponse.
     */
    public GenerationResponse generatePatients(int count);
}
