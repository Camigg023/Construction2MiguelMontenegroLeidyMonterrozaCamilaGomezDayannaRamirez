package app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.sql.Date;
import app.domain.model.User;
import app.domain.model.Patient;
import app.application.exceptions.InputsException;

@Component
public class OrderMedicationValidator extends SimpleValidator {

    public int idMedicationValidator(String value) throws Exception {
        return integerValidator("ID de la medicación", value);
    }

    public String dosageValidator(String value) throws Exception {
        return stringValidator("dosis de la medicación", value);
    }

    public String durationValidator(String value) throws Exception {
        return stringValidator("duración de la medicación", value);
    }

    public int itemValidator(String value) throws Exception {
        return integerValidator("ítem de la medicación", value);
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
        stringValidator("fecha de la medicación", value);
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parsedDate = formatter.parse(value);
            return new Date(parsedDate.getTime());
        } catch (Exception e) {
            throw new InputsException("La fecha de la medicación debe tener formato yyyy-MM-dd");
        }
    }

    public double costValidator(String value) throws Exception {
        return doubleValidator("costo de la medicación", value);
    }
}
