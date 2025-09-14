package app.domain.ports;

import app.domain.model.MedicalHistory;
import java.util.List;

public interface MedicalHistoryPort {
    void save(MedicalHistory medicalHistory) throws Exception;
    MedicalHistory findById(Long id) throws Exception;
    List<MedicalHistory> findByPatientId(Long patientId) throws Exception;
}