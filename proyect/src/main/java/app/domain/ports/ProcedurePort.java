
package app.domain.ports;
import app.domain.model.OrderProcedure;

public interface ProcedurePort {
    public OrderProcedure findByProcedureId (OrderProcedure procedure) throws Exception; 
    public OrderProcedure findByOrderNumber (OrderProcedure procedure) throws Exception; 
    public OrderProcedure findBySpecialistCode (OrderProcedure procedure) throws Exception;
        public void save (OrderProcedure procedure)throws Exception;
}
