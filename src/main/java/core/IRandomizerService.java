package core;

import core.model.common.Patient;

/**
 * Represents a randomizer service.
 */
public interface IRandomizerService {
    /**
     * Gets the random patient.
     * @return Returns a random patient.
     */
    public Patient getRandomPatient();
}
