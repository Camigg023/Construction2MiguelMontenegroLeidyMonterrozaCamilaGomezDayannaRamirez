
package src.main.java.app.domain.ports;

import src.main.java.app.domain.model.MedicalInsurance;
import src.main.java.app.domain.model.Patient;

public interface MedicalInsurancePort {
    public Patient findByIdentification (Patient patient) throws Exception;
    public MedicalInsurance findByPolicyNumber (MedicalInsurance medicalInsurance) throws Exception;
    public MedicalInsurance findByStatus (MedicalInsurance medicalInsurance) throws Exception;
        public void save (Patient patient) throws Exception;
        public void save (MedicalInsurance medicalInsurance) throws Exception;
}
