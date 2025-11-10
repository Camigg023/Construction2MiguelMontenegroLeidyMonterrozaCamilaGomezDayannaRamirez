package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;

@Component
public class DiagnosticTestResultValidator extends SimpleValidator {

    public long diagnosticTestIdValidator(String value) throws Exception {
        return longValidator("ID del examen diagnóstico", value);
    }

    public String nameValidator(String value) throws Exception {
        return stringValidator("nombre del examen diagnóstico", value);
    }

    public String descriptionValidator(String value) throws Exception {
        return stringValidator("descripción del examen diagnóstico", value);
    }

    public boolean requiresSpecialistValidator(Boolean value) throws Exception {
        if (value == null) {
            throw new Exception("Debe indicar si el examen requiere especialista");
        }
        return value;
    }

    public double baseCostValidator(String value) throws Exception {
        return doubleValidator("costo base del examen diagnóstico", value);
    }

    public String preparationInstructionsValidator(String value) throws Exception {
        // Campo opcional
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        return value.trim();
    }

    public boolean activeValidator(Boolean value) throws Exception {
        if (value == null) {
            throw new Exception("Debe indicar si el examen está activo o no");
        }
        return value;
    }
}

