package core.model.componentModel;

import java.time.LocalDateTime;

/**
 * Date of birth options for a patient.
 */
public class DateOfBirthOptions {
    private LocalDateTime end;
    private LocalDateTime exact;
    private LocalDateTime start;

    /**
     * Initializes a new instance of the DateOfBirthOptions class.
     */
    public DateOfBirthOptions() {
    }

    /**
     * Gets the end range for the date of birth.
     * @return end
     */
    public LocalDateTime getEnd() {
        return end;
    }

    /**
     * Sets the end range for the date of birth.
     * @param end End range for the date of birth.
     */
    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    /**
     * Gets the exact date of birth to use for the patient.
     * @return exact
     */
    public LocalDateTime getExact() {
        return exact;
    }

    /**
     * Sets the exact date of birth to use for the patient.
     * @param exact Exact date of birth.
     */
    public void setExact(LocalDateTime exact) {
        this.exact = exact;
    }

    /**
     * Gets the start range for the date of birth.
     * @return start
     */
    public LocalDateTime getStart() {
        return start;
    }

    /**
     * Sets the start range for the date of birth.
     * @param start Start range for the date of birth.
     */
    public void setStart(LocalDateTime start) {
        this.start = start;
    }
}
