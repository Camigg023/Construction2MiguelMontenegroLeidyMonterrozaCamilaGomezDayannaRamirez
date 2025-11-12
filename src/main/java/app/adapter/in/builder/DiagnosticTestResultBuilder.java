package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import src.main.java.app.adapter.in.validators.DiagnosticTestResultValidator;
import src.main.java.app.domain.model.DiagnosticTest;

@Component
public class DiagnosticTestResultBuilder {

    @Autowired
    private DiagnosticTestResultValidator validator;

    public DiagnosticTest build(
            String diagnosticTestId,
            String name,
            String description,
            Boolean requiresSpecialist,
            String baseCost,
            String preparationInstructions,
            Boolean active
    ) throws Exception {


        long validatedId = validator.diagnosticTestIdValidator(diagnosticTestId);
        String validatedName = validator.nameValidator(name);
        String validatedDescription = validator.descriptionValidator(description);
        boolean validatedRequiresSpecialist = validator.requiresSpecialistValidator(requiresSpecialist);
        double validatedBaseCost = validator.baseCostValidator(baseCost);
        String validatedInstructions = validator.preparationInstructionsValidator(preparationInstructions);
        boolean validatedActive = validator.activeValidator(active);


        DiagnosticTest diagnosticTest = new DiagnosticTest();
        diagnosticTest.setDiagnosticTestId((int) validatedId);
        diagnosticTest.setName(validatedName);
        diagnosticTest.setDescription(validatedDescription);
        diagnosticTest.setRequiresSpecialist(validatedRequiresSpecialist);
        diagnosticTest.setBaseCost(validatedBaseCost);
        diagnosticTest.setPreparationInstructions(validatedInstructions);
        diagnosticTest.setActive(validatedActive);

        return diagnosticTest;
    }
}

