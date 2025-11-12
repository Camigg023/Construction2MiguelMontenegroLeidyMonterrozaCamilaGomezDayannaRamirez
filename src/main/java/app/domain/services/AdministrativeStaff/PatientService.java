package src.main.java.app.domain.services.AdministrativeStaff;

import src.main.java.app.domain.model.Patient;
import src.main.java.app.domain.ports.PatientPort;

import java.util.List;

public class PatientService {

    private final PatientPort patientPort;

    /**
     * Constructor que inyecta el puerto de persistencia (adaptador de salida).
     */
    public PatientService(PatientPort patientPort) {
        this.patientPort = patientPort;
    }

    public void registerPatient(Patient patient) throws Exception {
        if (patient == null) {
            throw new IllegalArgumentException("El paciente no puede ser nulo");
        }
        patientPort.save(patient);
    }


    public Patient updatePatient(Patient patient) throws Exception {
        if (patient == null) {
            throw new IllegalArgumentException("Datos del paciente inválidos");
        }
        return patientPort.update(patient);
    }


    public void deletePatient(Patient patient) throws Exception {
        if (patient == null) {
            throw new IllegalArgumentException("Debe proporcionar un paciente válido para eliminar");
        }
        patientPort.delete(patient);
    }


    public Patient findByIdentification(Patient patient) throws Exception {
        return patientPort.findByIdentification(patient);
    }


    public List<Patient> findAllPatients() throws Exception {
        return patientPort.findAll();
    }
}

