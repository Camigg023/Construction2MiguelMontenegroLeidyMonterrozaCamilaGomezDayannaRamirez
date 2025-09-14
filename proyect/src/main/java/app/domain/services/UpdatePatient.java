
package app.domain.services;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.PatientPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdatePatient {
    @Autowired
    private PatientPort patientPort;
    @Autowired
    private User user;

    public Patient updateP(Patient patient) throws Exception {
        
        if (!user.getRole().equals(Role.ADMINISTRATIVESTAFF)) {
            throw new Exception("Solo el personal administrativo puede actualizar pacientes");
        }

        Patient existingPatient = patientPort.findById(patient);
        if (existingPatient == null) {
            throw new Exception("El paciente no existe, no se puede actualizar");
        }

        return patientPort.update(patient);
    }
}
