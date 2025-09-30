package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapter.in.validators.PatientValidator;
import app.domain.model.Patient;

@Component
public class PatientBuilder {
    
    @Autowired
    private PatientValidator patientValidator;
    
    public Patient builder(String id, String name, String birthDate, String address,
                           String telephoneNumber, String email, String gender, String age) throws Exception {
        
        Patient patient = new Patient();
        
        // Validaciones
        patient.setIdPatient(patientValidator.documentValidator(id)); 
        patient.setFullName(patientValidator.nameValidator(name));
        patient.setBirthay(patientValidator.birthDateValidator(birthDate)); 
        patient.setDirection(patientValidator.addressValidator(address));
        patient.setTelephoneNumber(patientValidator.telephoneValidator(telephoneNumber));
        patient.setEmail(patientValidator.emailValidator(email));
        patient.setGender(patientValidator.genderValidator(gender));
        
        // La edad solo se valida
        patientValidator.ageValidator(age); 
      
        // se llenan con sus propios builders más adelantito
        patient.setMedicalInsurance(null); 
        patient.setEmergencyContact(null); 
        
        return patient;
    }

    public Patient build(String name, String document, String age) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
