package messaging.model;

import java.util.ArrayList;

public class GenerationResponse {
    private  ArrayList<String> messages;
    private Boolean hasErrors;

    public GenerationResponse() {
        this.messages = new ArrayList<String>();
        this.hasErrors = false;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void addMessage(String message) {
        this.messages.add(message);
    }

    public Boolean hasErrors() {
        return hasErrors;
    }

    public void setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }
}
