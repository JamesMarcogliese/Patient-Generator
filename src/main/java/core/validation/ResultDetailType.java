package core.validation;

/**
 * Represents a result detail type.
 */
public enum ResultDetailType
{
    /**
     * Represents an error result.
     */
    Error(0),
    /**
     * Represents a warning result.
     */
    Warning(1),
    /**
     *
     */
    Information(2);

    private final int status;

    ResultDetailType(int status)
    {
        this.status = status;
    }
    public int status(){
        return this.status;
    }
}
