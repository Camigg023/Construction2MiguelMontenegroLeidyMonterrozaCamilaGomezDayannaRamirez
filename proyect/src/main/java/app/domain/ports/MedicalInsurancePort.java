
package app.domain.ports;

import app.domain.model.MedicalInsurance;
import app.domain.model.Patient;

public interface MedicalInsurancePort {
    public Patient findByIdentification (Patient patient) throws Exception;
    public MedicalInsurance findByPolicyNumber (MedicalInsurance medicalInsurance) throws Exception;
    public MedicalInsurance findByStatus (MedicalInsurance medicalInsurance) throws Exception;
        public void save (Patient patient) throws Exception;
        public void save (MedicalInsurance medicalInsurance) throws Exception;
}
