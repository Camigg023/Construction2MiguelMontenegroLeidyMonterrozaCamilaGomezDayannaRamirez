package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.java.app.adapter.in.validators.MedicalInsuranceValidator;
import src.main.java.app.adapter.in.validators.PatientValidator;
import src.main.java.app.domain.model.MedicalInsurance;
import src.main.java.app.domain.model.Patient;

import java.sql.Date;

@Component
public class MedicalInsuranceBuilder {

    @Autowired
    private MedicalInsuranceValidator medicalInsuranceValidator;
    @Autowired
    private PatientValidator patientValidator;

    public MedicalInsurance build(String policyNumber, String company, Date validity, Boolean status, String patientDocument)
     throws Exception {

        MedicalInsurance insurance = new MedicalInsurance();
        insurance.setPolicyNumber(medicalInsuranceValidator.policyNumberValidator(policyNumber));
        insurance.setCompany(medicalInsuranceValidator.companyValidator(company));
        insurance.setValidity(medicalInsuranceValidator.validityValidator(validity));
        insurance.setStatus(medicalInsuranceValidator.statusValidator(status));

        Patient patient = new Patient();
        patient.setIdPatient(patientValidator.documentValidator(patientDocument));
        insurance.setPatient(patient);

        return insurance;
    }
}
