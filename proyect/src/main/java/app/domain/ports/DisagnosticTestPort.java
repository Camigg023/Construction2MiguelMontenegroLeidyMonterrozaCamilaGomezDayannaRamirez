
package app.domain.ports;
import app.domain.model.Patient;
import app.domain.model.DiagnosticTest;


public interface DisagnosticTestPort {
    public Patient findByIdentification (Patient patient) throws Exception; 
    public DiagnosticTest findByDiagnosticId (DiagnosticTest diagnosticTest) throws Exception; 
    public DiagnosticTest FindByOrdeerNumber (DiagnosticTest diagnosticTest) throws Exception;
        public void save (Patient patient) throws Exception;
        public void save (DiagnosticTest diagnosticTest) throws Exception;
}
