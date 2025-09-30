package app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class AppointmentValidator extends SimpleValidator {

    public long patientIdValidator(String value) throws Exception {
        return longValidator("id del paciente", value);
    }

    public long doctorIdValidator(String value) throws Exception {
        return longValidator("id del doctor", value);
    }

    public Date dateValidator(String value) throws Exception {
        stringValidator("fecha de la cita", value);
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            formatter.setLenient(false); // evita fechas inválidas como 2025-02-30
            return formatter.parse(value);
        } catch (Exception e) {
            throw new Exception("La fecha de la cita debe tener formato yyyy-MM-dd");
        }
    }

    public String timeValidator(String value) throws Exception {
        stringValidator("hora de la cita", value);
        // Validación simple de formato HH:mm
        if (!value.matches("^([01]?\\d|2[0-3]):[0-5]\\d$")) {
            throw new Exception("La hora de la cita debe tener formato HH:mm (24 horas)");
        }
        return value;
    }

    public String reasonValidator(String value) throws Exception {
        return stringValidator("motivo de la cita", value);
    }

    public String statusValidator(String value) throws Exception {
        stringValidator("estado de la cita", value);
        // Validar que solo acepte valores permitidos
        if (!value.equalsIgnoreCase("pendiente") &&
            !value.equalsIgnoreCase("confirmada") &&
            !value.equalsIgnoreCase("cancelada")) {
            throw new Exception("Estado de la cita inválido. Valores permitidos: pendiente, confirmada, cancelada");
        }
        return value;
    }
}


