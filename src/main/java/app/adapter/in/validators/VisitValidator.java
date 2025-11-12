package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.sql.Date;

import src.main.java.app.domain.model.Patient;
import src.main.java.app.domain.model.User;
import app.application.exceptions.InputsException;

@Component
public class VisitValidator extends SimpleValidator {

    public int visitIdValidator(String value) throws Exception {
        return integerValidator("ID de la visita", value);
    }

    public Date visitDateValidator(String value) throws Exception {
        stringValidator("fecha de la visita", value);
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date parsedDate = formatter.parse(value);
            return new Date(parsedDate.getTime());
        } catch (Exception e) {
            throw new InputsException("La fecha de la visita debe tener formato yyyy-MM-dd");
        }
    }

    public String startTimeValidator(String value) throws Exception {
        return stringValidator("hora de inicio", value);
    }

    public String endTimeValidator(String value) throws Exception {
        return stringValidator("hora de fin", value);
    }

    public Patient patientValidator(Patient patient) throws Exception {
        if (patient == null) throw new InputsException("El paciente no puede ser nulo");
        return patient;
    }

    public User doctorValidator(User doctor) throws Exception {
        if (doctor == null) throw new InputsException("El doctor no puede ser nulo");
        return doctor;
    }

    public String notesValidator(String value) throws Exception {
        return stringValidator("notas de la visita", value);
    }

    public String statusValidator(String value) throws Exception {
        if (value == null || value.isEmpty()) throw new InputsException("El estado de la visita no puede ser vacío");
        if (!value.equalsIgnoreCase("Scheduled") &&
                !value.equalsIgnoreCase("In Progress") &&
                !value.equalsIgnoreCase("Completed") &&
                !value.equalsIgnoreCase("Cancelled")) {
            throw new InputsException("El estado de la visita debe ser: Scheduled, In Progress, Completed o Cancelled");
        }
        return value;
    }
}


