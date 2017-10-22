
package client.classes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patientRelationshipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="patientRelationshipType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MTH"/>
 *     &lt;enumeration value="FTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "patientRelationshipType")
@XmlEnum
public enum PatientRelationshipType {

    MTH,
    FTH;

    public String value() {
        return name();
    }

    public static PatientRelationshipType fromValue(String v) {
        return valueOf(v);
    }

}
