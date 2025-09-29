
package app.domain.services;

import app.domain.model.EmergencyContact;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.PatientPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateEmergencyContact {
    @Autowired
    private PatientPort patientPort;
    @Autowired
    private User user;
    @Autowired
    private Patient patient;
    
    public void create(EmergencyContact emergencyContact) throws Exception{
        if (!user.getRole().equals(Role.ADMINISTRATIVESTAFF)) {
            throw new Exception("Solo el personal administrativo puede crear contactos de emergencia");
        }

        Patient existingPatient = patientPort.findById(patient);
        if (existingPatient == null) {
            throw new Exception("El paciente no existe, no se puede actualizar");
        }

        patient.setEmergencyContact(emergencyContact);
    }
}
