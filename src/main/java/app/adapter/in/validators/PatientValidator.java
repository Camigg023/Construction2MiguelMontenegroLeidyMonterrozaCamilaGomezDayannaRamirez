package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.sql.Date;
import app.application.exceptions.InputsException;

@Component
public class PatientValidator extends SimpleValidator {

    public String nameValidator(String value) throws Exception {
        return stringValidator("nombre del paciente", value);
    }

    public Long documentValidator(String value) throws Exception {
        return longValidator("documento de identidad del paciente", value);
    }

    public Integer ageValidator(String value) throws Exception {
        return integerValidator("edad del paciente", value);
    }

    public String addressValidator(String value) throws Exception {
        return stringValidator("dirección del paciente", value);
    }

    public Long telephoneValidator(String value) throws Exception {
        return longValidator("teléfono del paciente", value);
    }

    public String emailValidator(String value) throws Exception {
        return stringValidator("correo electrónico del paciente", value);
    }

    public String genderValidator(String value) throws Exception {
        return stringValidator("género del paciente", value);
    }

    public Date birthDateValidator(String value) throws Exception {
        stringValidator("fecha de nacimiento del paciente", value);
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            formatter.setLenient(false);
            java.util.Date utilDate = formatter.parse(value);
            return new Date(utilDate.getTime());
        } catch (Exception e) {
            throw new InputsException("La fecha de nacimiento debe tener el formato válido (yyyy-MM-dd).");
        }
    }
}


