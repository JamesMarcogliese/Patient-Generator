package core.model.componentModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Calendar;

/**
 * Date of birth options for a patient.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DateOfBirthOptions {
    private Calendar end;
    private Calendar exact;
    private Calendar start;

    /**
     * Initializes a new instance of the DateOfBirthOptions class.
     */
    public DateOfBirthOptions() {
    }

    /**
     * Gets the end range for the date of birth.
     * @return end
     */
    public Calendar getEnd() {
        return end;
    }

    /**
     * Sets the end range for the date of birth.
     * @param end End range for the date of birth.
     */
    public void setEnd(Calendar end) {
        this.end = end;
    }

    /**
     * Gets the exact date of birth to use for the patient.
     * @return exact
     */
    public Calendar getExact() {
        return exact;
    }

    /**
     * Sets the exact date of birth to use for the patient.
     * @param exact Exact date of birth.
     */
    public void setExact(Calendar exact) {
        this.exact = exact;
    }

    /**
     * Gets the start range for the date of birth.
     * @return start
     */
    public Calendar getStart() {
        return start;
    }

    /**
     * Sets the start range for the date of birth.
     * @param start Start range for the date of birth.
     */
    public void setStart(Calendar start) {
        this.start = start;
    }
}
