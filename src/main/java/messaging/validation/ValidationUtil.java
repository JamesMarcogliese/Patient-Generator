package messaging.validation;

import core.model.componentModel.Demographic;
import core.validation.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class ValidationUtil {
    public Iterable<ResultDetail> validateMessage(Demographic options){

        ArrayList<ResultDetail> details = new ArrayList<>();

        if (options.getDateOfBirthOptions() != null){
            if(options.getDateOfBirthOptions().getStart() != null && options.getDateOfBirthOptions().getExact() != null){
                details.add(new ConflictingValueResultDetail(ResultDetailType.Error, "DateOfBirthOptions.End must be populated if DateOfBirthOptions.Start is populated."));
            }

            if(options.getDateOfBirthOptions().getEnd() != null && options.getDateOfBirthOptions().getExact() != null){
                details.add(new ConflictingValueResultDetail(ResultDetailType.Error, "DateOfBirthOptions.Start must be populated if DateOfBirthOptions.End is populated."));
            }

            if((options.getDateOfBirthOptions().getStart() != null && options.getDateOfBirthOptions().getEnd() != null) && options.getDateOfBirthOptions().getExact() != null){
                details.add(new ConflictingValueResultDetail(ResultDetailType.Error, "DateOfBirthOptions cannot have all fields populated."));
            }
        }

        if (options.getMetadata() != null){

            if(options.getMetadata().getAssigningAuthority() == null || StringUtils.isEmpty(options.getMetadata().getAssigningAuthority().trim())){
                details.add(new MandatoryElementMissingResultDetail(ResultDetailType.Error,  "Assigning Authority cannot be null or empty."));
            }

            if((options.getMetadata().useHL7v2() != null && options.getMetadata().useHL7v2()) || (options.getMetadata().useHL7v3() != null && options.getMetadata().useHL7v3())){

                if(options.getMetadata().getReceivingApplication() == null || StringUtils.isEmpty(options.getMetadata().getReceivingApplication().trim())){
                    details.add(new MandatoryElementMissingResultDetail(ResultDetailType.Error, "ReceivingApplication cannot be null or empty."));
                }

                if(options.getMetadata().getReceivingFacility() == null || StringUtils.isEmpty(options.getMetadata().getReceivingFacility().trim())){
                    details.add(new MandatoryElementMissingResultDetail(ResultDetailType.Error,"ReceivingFacility cannot be null or empty."));
                }

                if(options.getMetadata().getSendingApplication() == null || StringUtils.isEmpty(options.getMetadata().getSendingApplication().trim())){
                    details.add(new MandatoryElementMissingResultDetail(ResultDetailType.Error, "SendingApplication cannot be null or empty."));
                }

                if(options.getMetadata().getSendingFacility() == null || StringUtils.isEmpty(options.getMetadata().getSendingFacility().trim())){
                    details.add(new MandatoryElementMissingResultDetail(ResultDetailType.Error, "SendingFacility cannot be null or empty."));
                }

            } else {
                details.add(new MandatoryElementMissingResultDetail(ResultDetailType.Error,  "Must specify FHIR, HL7v2, or HL7v3"));
            }

        }

        return details;
    }
}
