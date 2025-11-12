package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import app.application.exceptions.InputsException;

@Component
public class SpecialtyValidator extends SimpleValidator {

    public long idValidator(String value) throws Exception {
        return longValidator("ID de la especialidad", value);
    }

    public String nameValidator(String value) throws Exception {
        String name = stringValidator("nombre de la especialidad", value);
        if (name.length() < 3) {
            throw new InputsException("El nombre de la especialidad debe tener al menos 3 caracteres");
        }
        return name;
    }

    public String descriptionValidator(String value) throws Exception {
        if (value == null || value.trim().isEmpty()) {
            return "Sin descripción";
        }
        return stringValidator("descripción de la especialidad", value);
    }
}

