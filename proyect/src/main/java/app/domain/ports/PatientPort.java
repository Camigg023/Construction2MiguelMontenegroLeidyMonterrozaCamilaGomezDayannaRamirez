
package app.domain.ports;

import app.domain.model.Patient;


public interface PatientPort {
    public void save(Patient patient) throws Exception;

	public Patient findById(Patient patient) throws Exception;
    
}
