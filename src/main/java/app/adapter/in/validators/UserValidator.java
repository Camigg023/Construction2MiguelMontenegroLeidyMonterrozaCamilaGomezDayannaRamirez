package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import app.application.exceptions.InputsException;

import java.text.SimpleDateFormat;
import java.sql.Date;

@Component
public class UserValidator extends SimpleValidator {

    public Long identificationValidator(Long value) throws Exception {
        return longValidator("identificación del usuario", String.valueOf(value));
    }

    public String nameValidator(String value) throws Exception {
        return stringValidator("nombre del usuario", value);
    }

    public String emailValidator(String value) throws Exception {
        return stringValidator("email del usuario", value);
    }

    public String addressValidator(String value) throws Exception {
        return stringValidator("dirección del usuario", value);
    }

    public String userNameValidator(String value) throws Exception {
        return stringValidator("nombre de usuario", value);
    }

    public String passwordValidator(String value) throws Exception {
        return stringValidator("contraseña del usuario", value);
    }

    public Long phoneValidator(Long value) throws Exception {
        return longValidator("teléfono del usuario", String.valueOf(value));
    }

    public Date birthDayValidator(String value) throws Exception {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            java.util.Date utilDate = dateFormat.parse(value);
            return new Date(utilDate.getTime());
        } catch (Exception e) {
            throw new InputsException("La fecha de nacimiento no tiene un formato válido (yyyy-MM-dd).");
        }
    }
}


