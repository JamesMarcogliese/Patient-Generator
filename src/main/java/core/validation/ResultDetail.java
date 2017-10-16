package core.validation;

/**
 * Represents a result detail.
 * @see core.validation.IResultDetail
 */
public class ResultDetail implements IResultDetail
{
    private String message;
    private String location;
    private Exception exception;
    private ResultDetailType type;

    /**
     * Initializes a new instance of the ResultDetail class.
     * @param message The message.
     */
    public ResultDetail(String message)
    {
        this.message = message;
    }

    /**
     * Initializes a new instance of the ResultDetail class.
     * @param type The type.
     * @param message The message.
     */
    public ResultDetail(ResultDetailType type, String message)
    {
        this.message = message;
        this.location = null;
        this.type = type;
    }

    /**
     * Initializes a new instance of the ResultDetail class.
     * @param type The type.
     * @param message The message.
     * @param exception The exception.
     */
    public ResultDetail(ResultDetailType type, String message, Exception exception)
    {
        this.message = message;
        this.exception = exception;
        this.location = null;
        this.type = type;
    }

    /**
     * Initializes a new instance of the ResultDetail class.
     * @param type The type.
     * @param message The message.
     * @param location The location.
     * @param exception The exception.
     */
    public ResultDetail(ResultDetailType type, String message, String location, Exception exception)
    {
        this.message = message;
        this.exception = exception;
        this.location = location;
        this.type = type;
    }

    /**
     * Gets the exception.
     * @return exception
     */
    @Override
    public Exception getException()
    {
        return exception;
    }

    /**
     * Gets the location.
     * @return location
     */
    @Override
    public String getLocation()
    {
        return location;
    }

    /**
     * Sets the location.
     * @param location Location.
     */
    @Override
    public void setLocation(String location)
    {
        this.location = location;
    }

    /**
     * Gets the message.
     * @return message
     */
    @Override
    public String getMessage()
    {
        return message;
    }

    /**
     * Gets the type.
     * @return type
     */
    @Override
    public ResultDetailType getType()
    {
        return type;
    }

    /**
     * Returns a string that represents this instance.
     * @return str
     */
    @Override
    public String toString()
    {
        String str = "";
        if (type != null)
        {
            str.concat(type + " ");
        }
        if (message != null)
        {
            str.concat(message + " ");
        }
        if (location != null)
        {
            str.concat(location);
        }
        return str;
    }
}
