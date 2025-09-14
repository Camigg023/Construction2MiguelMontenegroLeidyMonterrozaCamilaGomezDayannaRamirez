package app.domain.services;


import app.domain.model.MedicalHistory;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.MedicalHistoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateMedicalHistory {

    private final MedicalHistoryPort medicalHistoryPort;

    @Autowired
    public CreateMedicalHistory(MedicalHistoryPort medicalHistoryPort) {
        this.medicalHistoryPort = medicalHistoryPort;
    }

    public void create(MedicalHistory medicalHistory, User doctor) throws Exception {
        // Validar rol
        if (doctor == null || !doctor.getRole().equals(Role.DOCTORS)) {
            throw new Exception("Solo los médicos pueden crear historias clínicas");
        }

        medicalHistory.setDoctor(doctor);

        if (medicalHistory.getDate() == null) {
            medicalHistory.setDate(new java.util.Date());
        }
        
        medicalHistoryPort.save(medicalHistory);
    }
}

