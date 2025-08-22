
package app.domain.ports;
import app.domain.model.MedicalHistory;
import app.domain.model.Patient;

public interface MedicalHistoryPort {
    public Patient findByIdentification (Patient patient) throws Exception;
    public MedicalHistory findByMedicalId (MedicalHistory medicalHistory) throws Exception;
        public void save (Patient patient) throws Exception;
        public void save (MedicalHistory medicalHistory) throws Exception;
}
