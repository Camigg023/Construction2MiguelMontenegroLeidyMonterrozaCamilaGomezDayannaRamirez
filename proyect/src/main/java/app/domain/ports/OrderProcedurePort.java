
package app.domain.ports;


import app.domain.model.OrderProcedure;
import app.domain.model.Patient;
import java.util.List;

public interface OrderProcedurePort {
    public OrderProcedure FindbyOrderNumber (OrderProcedure orderProcedure) throws Exception;
    List<OrderProcedure> findByPatientId(Long patientId) throws Exception;
    public List<OrderProcedure> findByPatient(Patient patient) throws Exception;
        public void save (OrderProcedure orderProcedure) throws Exception;
    
}
