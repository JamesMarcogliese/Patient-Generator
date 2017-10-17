package messaging.model;

import java.util.ArrayList;

/**
 * Represents a generation response.
 */
public class GenerationResponse {
    private  ArrayList<String> messages;
    private Boolean hasErrors;

    /**
     * Initializes a new instance of the GenerationResponse class.
     */
    public GenerationResponse() {
        this.messages = new ArrayList<String>();
        this.hasErrors = false;
    }

    /**
     * Get messages, if any.
     * @return A message.
     */
    public ArrayList<String> getMessages() {
        return messages;
    }

    /**
     * Add messages, if any.
     * @param message A message.
     */
    public void addMessage(String message) {
        this.messages.add(message);
    }

    /**
     * When true, a problem occurred when generating patients.
     * @return If a problem occurred when generating patients.
     */
    public Boolean hasErrors() {
        return hasErrors;
    }

    /**
     * When true, a problem occurred when generating patients.
     * @param hasErrors If a problem occurred when generating patients.
     */
    public void setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }
}
