package src.main.java.app.domain.ports;

import java.util.List;
import src.main.java.app.domain.model.Procedure;

public interface ProcedurePort {

    Procedure save(Procedure procedure);
    Procedure update(Procedure procedure);
    Procedure findById(long procedureCode);
    List<Procedure> findAll();
}
