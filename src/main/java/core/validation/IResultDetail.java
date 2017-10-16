package core.validation;

/**
 * Represents a result detail.
 */
public interface IResultDetail
{
    /**
     * Gets the exception.
     * @return The exception.
     */
    public Exception getException();

    /**
     * Gets the location.
     * @return The location
     */
    public String getLocation();

    /**
     * Sets the location.
     * @param location The location.
     */
    public void setLocation(String location);

    /**
     * Gets the message.
     * @return The message.
     */
    public String getMessage();

    /**
     * Gets the Result.
     * @return The type
     */
    public ResultDetailType getType();
}
