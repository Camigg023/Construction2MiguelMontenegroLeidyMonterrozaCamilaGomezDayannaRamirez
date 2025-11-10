package src.main.java.app.domain.services.InformationSupport;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.Procedure;
import src.main.java.app.domain.ports.ProcedurePort;

@Service
public class ProcedureService {

    @Autowired
    private ProcedurePort procedurePort;


    public void registerProcedure(Procedure procedure) throws BusinessException {
        if (procedure == null) {
            throw new BusinessException("El procedimiento no puede ser nulo.");
        }

        if (procedure.getName() == null || procedure.getName().isEmpty()) {
            throw new BusinessException("El procedimiento debe tener un nombre válido.");
        }

        if (procedure.getBaseCost() <= 0) {
            throw new BusinessException("El costo base del procedimiento debe ser mayor que cero.");
        }

        if (procedure.getDescription() == null || procedure.getDescription().isEmpty()) {
            throw new BusinessException("Debe especificarse una descripción del procedimiento.");
        }

        procedurePort.save(procedure);
    }


    public void updateProcedure(Procedure procedure) throws BusinessException {
        if (procedure == null || procedure.getProcedureCode() <= 0) {
            throw new BusinessException("Debe proporcionar un procedimiento válido con un código correcto.");
        }

        Procedure existingProc = procedurePort.findById(procedure.getProcedureCode());
        if (existingProc == null) {
            throw new BusinessException("No se encontró el procedimiento con el código especificado.");
        }

        procedurePort.update(procedure);
    }


    public Procedure getProcedureById(long code) throws BusinessException {
        if (code <= 0) {
            throw new BusinessException("El código del procedimiento debe ser mayor que cero.");
        }

        Procedure procedure = procedurePort.findById(code);
        if (procedure == null) {
            throw new BusinessException("No existe un procedimiento con el código especificado.");
        }

        return procedure;
    }


    public List<Procedure> listAllProcedures() {
        return procedurePort.findAll();
    }
}

