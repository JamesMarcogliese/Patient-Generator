package core.validation;

/**
 * Represents a result detail indicating a conflicting value.
 */
public class ConflictingValueResultDetail extends ResultDetail{

    /**
     * Initializes a new instance of the ConflictingValueResultDetail class.
     * @param message The message.
     */
    public ConflictingValueResultDetail(String message) {
        super(message);
    }

    /**
     * Initializes a new instance of the ConflictingValueResultDetail class.
     * @param type The type.
     * @param message The message.
     */
    public ConflictingValueResultDetail(ResultDetailType type, String message) {
        super(type, message);
    }

    /**
     * Initializes a new instance of the ConflictingValueResultDetail class.
     * @param type The type.
     * @param message The message.
     * @param exception The exception.
     */
    public ConflictingValueResultDetail(ResultDetailType type, String message, Exception exception) {
        super(type, message, exception);
    }

    /**
     * Initializes a new instance of the ConflictingValueResultDetail class.
     * @param type The type.
     * @param message The message.
     * @param location The location.
     * @param exception The exception.
     */
    public ConflictingValueResultDetail(ResultDetailType type, String message, String location, Exception exception) {
        super(type, message, location, exception);
    }
}
