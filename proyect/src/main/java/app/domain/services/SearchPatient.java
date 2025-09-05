
package app.domain.services;

import app.domain.ports.PatientPort;
import app.domain.model.Patient;

public class SearchPatient {
    
    private PatientPort patientPort;
    
    public Patient search (Patient patient) throws Exception{
            patient = patientPort.findById(patient);
            if (patient == null) {
               throw new Exception("Debes consultar un paciente registrado");
            }
            return patientPort.findById(patient);
    }
}
