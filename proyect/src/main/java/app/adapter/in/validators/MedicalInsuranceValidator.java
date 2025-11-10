package src.main.java.app.adapter.in.validators;

import java.sql.Date;
import org.springframework.stereotype.Component;

@Component
public class MedicalInsuranceValidator {

    public String policyNumberValidator(String policyNumber) throws Exception {
        if (policyNumber == null || policyNumber.trim().isEmpty()) {
            throw new Exception("Policy number cannot be empty.");
        }
        if (!policyNumber.matches("^[A-Z0-9-]+$")) {
            throw new Exception("Policy number must contain only letters, digits or hyphens.");
        }
        return policyNumber.trim();
    }

    public String companyValidator(String company) throws Exception {
        if (company == null || company.trim().isEmpty()) {
            throw new Exception("Insurance company name cannot be empty.");
        }
        if (company.length() < 3) {
            throw new Exception("Insurance company name must have at least 3 characters.");
        }
        return company.trim();
    }

    public Date validityValidator(Date validity) throws Exception {
        if (validity == null) {
            throw new Exception("Validity date cannot be null.");
        }
        Date currentDate = new Date(System.currentTimeMillis());
        if (validity.before(currentDate)) {
            throw new Exception("The insurance policy cannot have an expired validity date.");
        }
        return validity;
    }

    public Boolean statusValidator(Boolean status) throws Exception {
        if (status == null) {
            throw new Exception("Insurance status cannot be null.");
        }
        return status;
    }
}

