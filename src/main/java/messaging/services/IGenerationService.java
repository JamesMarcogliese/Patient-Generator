package messaging.services;

import core.model.componentModel.Demographic;
import messaging.model.GenerationResponse;

public interface IGenerationService {
    public GenerationResponse generatePatients(Demographic options);
    public GenerationResponse generatePatients(int count);
}
