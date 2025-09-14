package app.domain.services;

import app.domain.model.MedicalHistory;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.MedicalHistoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateMedicalHistory {

    private final MedicalHistoryPort medicalHistoryPort;

    @Autowired
    public UpdateMedicalHistory(MedicalHistoryPort medicalHistoryPort) {
        this.medicalHistoryPort = medicalHistoryPort;
    }

    private void validateDoctor(User user) throws Exception {
        if (user == null || !user.getRole().equals(Role.DOCTORS)) {
            throw new Exception("Solo los médicos pueden actualizar historias clínicas");
        }
    }

    public MedicalHistory update(User doctor, Long historyId, MedicalHistory updatedHistory) throws Exception {
        
        validateDoctor(doctor);

        MedicalHistory existingHistory = medicalHistoryPort.findById(historyId);
        if (existingHistory == null) {
            throw new Exception("La historia clínica no existe");
        }

        existingHistory.setChiefComplaint(updatedHistory.getChiefComplaint());
        existingHistory.setSymptoms(updatedHistory.getSymptoms());
        existingHistory.setDiagnosis(updatedHistory.getDiagnosis());
        existingHistory.setDate(updatedHistory.getDate() != null ? updatedHistory.getDate() : existingHistory.getDate());
        existingHistory.setDoctor(doctor); 

        medicalHistoryPort.save(existingHistory);

        return existingHistory;
    }
}
