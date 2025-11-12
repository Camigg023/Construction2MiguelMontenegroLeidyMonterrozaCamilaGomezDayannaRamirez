package src.main.java.app.domain.services.Doctors;

import src.main.java.app.domain.model.MedicalHistory;
import src.main.java.app.domain.ports.MedicalHistoryPort;

import java.util.Date;
import java.util.List;


public class MedicalHistoryService {

    private final MedicalHistoryPort medicalHistoryPort;

    public MedicalHistoryService(MedicalHistoryPort medicalHistoryPort) {
        this.medicalHistoryPort = medicalHistoryPort;
    }

    public void createMedicalRecord(MedicalHistory history) throws Exception {
        if (history == null) {
            throw new IllegalArgumentException("El objeto de historia médica no puede ser nulo.");
        }

        if (history.getPatient() == null) {
            throw new IllegalArgumentException("La historia médica debe tener un paciente asignado.");
        }

        if (history.getDoctor() == null) {
            throw new IllegalArgumentException("Debe especificarse el médico que atendió la consulta.");
        }

        if (history.getDate() == null) {
            history.setDate(new Date());
        }

        medicalHistoryPort.save(history);
    }


    public void updateMedicalRecord(String patientId, MedicalHistory update) throws Exception {
        if (patientId == null || patientId.isEmpty()) {
            throw new IllegalArgumentException("El ID del paciente no puede estar vacío.");
        }

        if (update == null) {
            throw new IllegalArgumentException("Los datos de actualización no pueden ser nulos.");
        }


        Long id = Long.parseLong(patientId);
        List<MedicalHistory> existingHistories = medicalHistoryPort.findByPatientId(id);

        if (existingHistories.isEmpty()) {
            throw new IllegalArgumentException("No existe historia médica registrada para este paciente.");
        }


        medicalHistoryPort.update(update);
    }


    public List<MedicalHistory> getMedicalHistoryByPatient(String patientId) throws Exception {
        if (patientId == null || patientId.isEmpty()) {
            throw new IllegalArgumentException("El ID del paciente no puede estar vacío.");
        }

        Long id = Long.parseLong(patientId);
        return medicalHistoryPort.findByPatientId(id);
    }
}
