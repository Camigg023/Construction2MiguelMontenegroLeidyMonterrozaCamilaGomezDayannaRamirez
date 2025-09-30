package app.adapter.in.validators;

import org.springframework.stereotype.Component;
import app.application.exceptions.InputsException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import app.domain.model.User;

@Component
public class UserValidator extends SimpleValidator {

    public long idValidator(String value) throws Exception {
        return longValidator("identificación del doctor", value);
    }

    public String nameValidator(String value) throws Exception {
        return stringValidator("nombre del doctor", value);
    }

    public String emailValidator(String value) throws Exception {
        return stringValidator("email del doctor", value);
    }

    public String addressValidator(String value) throws Exception {
        return stringValidator("dirección del doctor", value);
    }

    public String userNameValidator(String value) throws Exception {
        return stringValidator("nombre de usuario del doctor", value);
    }

    public String passwordValidator(String value) throws Exception {
        return stringValidator("contraseña del doctor", value);
    }

    public int phoneValidator(String value) throws Exception {
        return integerValidator("teléfono del doctor", value);
    }

    public Date birthDayValidator(String value) throws Exception {
        stringValidator("fecha de nacimiento del doctor", value);
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parsedDate = formatter.parse(value);
            return new Date(parsedDate.getTime());
        } catch (Exception e) {
            throw new InputsException("La fecha de nacimiento debe tener formato yyyy-MM-dd");
        }
    }
}
