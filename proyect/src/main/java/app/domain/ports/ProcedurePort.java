
package app.domain.ports;
import app.domain.model.Procedure;

public interface ProcedurePort {
    public Procedure findByProcedureId (Procedure procedure) throws Exception; 
    public Procedure findByOrderNumber (Procedure procedure) throws Exception; 
    public Procedure findBySpecialistCode (Procedure procedure) throws Exception;
        public void save (Procedure procedure)throws Exception;
}
