package core.model.componentModel;

import java.util.List;

/**
 * Represents related person options.
 */
public class RelatedPerson {
    private List<Address> address;
    private List<Name> names;
    private String phone;
    private PatientRelationshipType relationship;

    /**
     * Represents a patient relationship type.
     */
    public enum PatientRelationshipType {
        /**
         * Represents a relationship type of Mother.
         */
        MTH,
        /**
         * Represents a relationship type of Father.
         */
        FTH
    }

    /**
     * Gets the address.
     * @return address
     */
    public List<Address> getAddress() {
        return address;
    }

    /**
     * Sets the address.
     * @param address The address of the related person.
     */
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * Gets the names.
     * @return names
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Sets the address.
     * @param names The names of the related person.
     */
    public void setNames(List<Name> names) {
        this.names = names;
    }

    /**
     * Gets the phone.
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     * @param phone The phone of the related person.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the relationship.
     * @return relationship
     */
    public PatientRelationshipType getRelationship() {
        return relationship;
    }

    /**
     * Sets the relationship.
     * @param relationship The relationships of the related person.
     */
    public void setRelationship(PatientRelationshipType relationship) {
        this.relationship = relationship;
    }
}
