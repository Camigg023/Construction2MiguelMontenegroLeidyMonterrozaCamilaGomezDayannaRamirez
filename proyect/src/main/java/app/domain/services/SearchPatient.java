
package app.domain.services;

import app.domain.ports.PatientPort;
import app.domain.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchPatient {
    @Autowired
    private PatientPort patientPort;
    
    public Patient search (Patient patient) throws Exception{
            patient = patientPort.findById(patient);
            if (patient == null) {
               throw new Exception("Debes consultar un paciente registrado");
            }
            return patientPort.findById(patient);
    }
}
