package src.main.java.app.domain.services.InformationSupport;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.DiagnosticTest;
import src.main.java.app.domain.ports.DiagnosticTestPort;

@Service
public class DiagnosticTestService {

    @Autowired
    private DiagnosticTestPort diagnosticTestPort;


    public void registerDiagnosticTest(DiagnosticTest test) throws BusinessException {
        if (test == null) {
            throw new BusinessException("La prueba diagnóstica no puede ser nula.");
        }

        if (test.getName() == null || test.getName().isBlank()) {
            throw new BusinessException("El nombre de la prueba diagnóstica es obligatorio.");
        }

        if (test.getDescription() == null || test.getDescription().isBlank()) {
            throw new BusinessException("Debe proporcionar una descripción para la prueba diagnóstica.");
        }

        if (test.getBaseCost() <= 0) {
            throw new BusinessException("El costo base debe ser mayor que cero.");
        }

        diagnosticTestPort.save(test);
    }


    public void updateDiagnosticTest(DiagnosticTest test) throws BusinessException {
        if (test == null) {
            throw new BusinessException("El objeto de prueba diagnóstica no puede ser nulo.");
        }

        DiagnosticTest existing = diagnosticTestPort.findById(test.getDiagnosticTestId());
        if (existing == null) {
            throw new BusinessException("No existe una prueba diagnóstica con el ID especificado.");
        }

        diagnosticTestPort.update(test);
    }


    public DiagnosticTest getDiagnosticTestById(long id) throws BusinessException {
        DiagnosticTest test = diagnosticTestPort.findById(id);
        if (test == null) {
            throw new BusinessException("No se encontró ninguna prueba diagnóstica con el ID: " + id);
        }
        return test;
    }


    public List<DiagnosticTest> listAllDiagnosticTests() {
        return diagnosticTestPort.findAll();
    }
}

