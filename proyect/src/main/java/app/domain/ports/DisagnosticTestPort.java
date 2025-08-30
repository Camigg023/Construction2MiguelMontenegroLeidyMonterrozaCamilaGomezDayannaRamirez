
package app.domain.ports;
import app.domain.model.Patient;
import app.domain.model.OrderDiagnosticTest;


public interface DisagnosticTestPort {
    public Patient findByIdentification (Patient patient) throws Exception; 
    public OrderDiagnosticTest findByDiagnosticId (OrderDiagnosticTest diagnosticTest) throws Exception; 
    public OrderDiagnosticTest FindByOrdeerNumber (OrderDiagnosticTest diagnosticTest) throws Exception;
        public void save (Patient patient) throws Exception;
        public void save (OrderDiagnosticTest diagnosticTest) throws Exception;
}
