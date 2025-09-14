package app.domain.services;

import app.domain.model.MedicalHistory;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.MedicalHistoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchMedicalHistory {

    private final MedicalHistoryPort medicalHistoryPort;

    @Autowired
    public SearchMedicalHistory(MedicalHistoryPort medicalHistoryPort) {
        this.medicalHistoryPort = medicalHistoryPort;
    }

    private void validateDoctor(User user) throws Exception {
        if (user == null || !user.getRole().equals(Role.DOCTORS)) {
            throw new Exception("Solo los médicos pueden consultar historias clínicas");
        }
    }

    public MedicalHistory searchById(User doctor, Long id) throws Exception {
        validateDoctor(doctor);
        return medicalHistoryPort.findById(id);
    }

    public List<MedicalHistory> searchByPatient(User doctor, Long patientId) throws Exception {
        validateDoctor(doctor);
        return medicalHistoryPort.findByPatientId(patientId);
    }
}
