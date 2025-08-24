
package app.domain.services;

import app.domain.model.User;
import app.domain.model.Patient;
import app.domain.ports.PatientPort;
import app.domain.model.emuns.Role;

public class CreatePatient {
    
    
    private PatientPort patientPort;
    private User user;
    public void create (Patient patient) throws Exception{
        
        if(patientPort.findById(patient) != null){
            throw new Exception ("El paciente ya existe");
        }
        if (!user.getRole().equals(Role.ADMINISTRATIVESTAFF)){
            throw new Exception ("Solo el personal administrativo puede crear pacientes");
        }
        patientPort.save(patient);
    }
}
