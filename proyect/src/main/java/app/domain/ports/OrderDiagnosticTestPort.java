
package app.domain.ports;

import app.domain.model.OrderDiagnosticTest;
import app.domain.model.Patient;
import java.util.List;


public interface OrderDiagnosticTestPort {
    public OrderDiagnosticTest FindbyOrderNumber (OrderDiagnosticTest orderDiagnosticTest) throws Exception;
    public List<OrderDiagnosticTest> findByPatient(Patient patient) throws Exception;
        public void save (OrderDiagnosticTest orderDiagnosticTest) throws Exception;
}

