package core.validation;

/**
 * Represents a result detail indicating a mandatory element is missing.
 */
public class MandatoryElementMissingResultDetail extends ResultDetail{

    /**
     * Initializes a new instance of the MandatoryElementMissingResultDetail class.
     * @param message The message.
     */
    public MandatoryElementMissingResultDetail(String message) {
        super(message);
    }

    /**
     * Initializes a new instance of the MandatoryElementMissingResultDetail class.
     * @param type The type.
     * @param message The message.
     */
    public MandatoryElementMissingResultDetail(ResultDetailType type, String message) {
        super(type, message);
    }

    /**
     * Initializes a new instance of the MandatoryElementMissingResultDetail class.
     * @param type The type.
     * @param message The message.
     * @param exception The exception.
     */
    public MandatoryElementMissingResultDetail(ResultDetailType type, String message, Exception exception) {
        super(type, message, exception);
    }

    /**
     * Initializes a new instance of the MandatoryElementMissingResultDetail class.
     * @param type The type.
     * @param message The message.
     * @param location The location.
     * @param exception The exception.
     */
    public MandatoryElementMissingResultDetail(ResultDetailType type, String message, String location, Exception exception) {
        super(type, message, location, exception);
    }
}
