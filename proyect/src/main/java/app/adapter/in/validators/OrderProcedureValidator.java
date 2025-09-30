package app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.sql.Date;
import app.domain.model.User;
import app.domain.model.Patient;
import app.application.exceptions.InputsException;

@Component
public class OrderProcedureValidator extends SimpleValidator {

    public long procedureIdValidator(String value) throws Exception {
        return longValidator("ID del procedimiento", value);
    }

    public int quantityValidator(String value) throws Exception {
        return integerValidator("cantidad del procedimiento", value);
    }

    public String frequencyValidator(String value) throws Exception {
        return stringValidator("frecuencia del procedimiento", value);
    }

    public Boolean requiresSpecialistValidator(String value) throws Exception {
        if (value == null || (!value.equalsIgnoreCase("true") && !value.equalsIgnoreCase("false"))) {
            throw new InputsException("requiresSpecialist debe ser true o false");
        }
        return Boolean.parseBoolean(value);
    }

    public int specialistCodeValidator(String value) throws Exception {
        return integerValidator("código de especialista", value);
    }

    public int itemValidator(String value) throws Exception {
        return integerValidator("ítem del procedimiento", value);
    }

    public User doctorValidator(User doctor) throws Exception {
        if (doctor == null) {
            throw new InputsException("El doctor no puede ser nulo");
        }
        return doctor;
    }

    public Patient patientValidator(Patient patient) throws Exception {
        if (patient == null) {
            throw new InputsException("El paciente no puede ser nulo");
        }
        return patient;
    }

    public Date dateValidator(String value) throws Exception {
        stringValidator("fecha del procedimiento", value);
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parsedDate = formatter.parse(value);
            return new Date(parsedDate.getTime());
        } catch (Exception e) {
            throw new InputsException("La fecha debe tener formato yyyy-MM-dd");
        }
    }

    public double costValidator(String value) throws Exception {
        return doubleValidator("costo del procedimiento", value);
    }
}

