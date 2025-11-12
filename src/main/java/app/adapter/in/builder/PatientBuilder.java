package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.java.app.domain.model.Patient;
import src.main.java.app.adapter.in.validators.PatientValidator;

@Component
public class PatientBuilder {

    @Autowired
    private PatientValidator patientValidator;

    public Patient build(String id, String name, String birthDate, String address, String telephoneNumber, String email, String gender, String age)
      throws Exception {

        Patient patient = new Patient();

        Long validatedId = patientValidator.documentValidator(id);
        String validatedName = patientValidator.nameValidator(name);
        java.sql.Date validatedBirthDate = patientValidator.birthDateValidator(birthDate);
        String validatedAddress = patientValidator.addressValidator(address);
        Long validatedTelephone = patientValidator.telephoneValidator(telephoneNumber);
        String validatedEmail = patientValidator.emailValidator(email);
        String validatedGender = patientValidator.genderValidator(gender);

        patientValidator.ageValidator(age);

        patient.setIdPatient(validatedId);
        patient.setFullName(validatedName);
        patient.setBirthday(validatedBirthDate);
        patient.setDirection(validatedAddress);
        patient.setTelephoneNumber(validatedTelephone);
        patient.setEmail(validatedEmail);
        patient.setGender(validatedGender);

        patient.setMedicalInsurance(null);
        patient.setEmergencyContact(null);

        return patient;
    }
}
