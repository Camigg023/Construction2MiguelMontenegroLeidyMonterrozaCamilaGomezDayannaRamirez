package src.main.java.app.domain.ports;

import java.util.List;
import src.main.java.app.domain.model.DiagnosticTest;

public interface DiagnosticTestPort {

    DiagnosticTest save(DiagnosticTest diagnosticTest);
    DiagnosticTest update(DiagnosticTest diagnosticTest);
    DiagnosticTest findById(long diagnosticTestId);
    List<DiagnosticTest> findAll();
}

