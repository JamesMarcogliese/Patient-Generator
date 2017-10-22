package core.model.componentModel;

import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents telecom options for a patient.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Telecommunication {
    private List<String> emailAddresses;
    private List<String> phoneNumbers;

    /**
     * Initializes a new instance of the TelecomOptions class.
     */
    public Telecommunication() {
        this.emailAddresses = new ArrayList<String>();
        this.phoneNumbers = new ArrayList<String>();
    }

    /**
     * Gets the email addresses of a patient.
     * @return emailAddresses
     */
    public List<String> getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the email addresses of a patient.
     * @param emailAddresses Email addresses of a patient.
     */
    public void setEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    /**
     * Gets the phone numbers of a patient.
     * @return phoneNumbers
     */
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the phone numbers of a patient.
     * @param phoneNumbers Phone numbers of a patient.
     */
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
