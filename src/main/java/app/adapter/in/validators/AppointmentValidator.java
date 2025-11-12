package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import src.main.java.app.domain.model.emuns.AppointmentStatus;
import src.main.java.app.domain.model.emuns.AppointmentType;
import java.sql.Date;
import java.sql.Time;


@Component
public class AppointmentValidator extends SimpleValidator {

    public int idValidator(String value) throws Exception {
        return integerValidator("El número de cita", value);
    }

    public Date dateValidator(String value) throws Exception {
        stringValidator("La fecha de la cita", value);
        return Date.valueOf(value); // Formato esperado: yyyy-MM-dd
    }

    public Time timeValidator(String value) throws Exception {
        stringValidator("La hora de la cita", value);
        return Time.valueOf(value); // Formato esperado: HH:mm:ss
    }

    public String reasonValidator(String value) throws Exception {
        return stringValidator("El motivo de la cita", value);
    }

    public AppointmentType typeValidator(String value) throws Exception {
        stringValidator("El tipo de cita", value);
        return AppointmentType.valueOf(value.toUpperCase());
    }

    public AppointmentStatus statusValidator(String value) throws Exception {
        stringValidator("El estado de la cita", value);
        return AppointmentStatus.valueOf(value.toUpperCase());
    }
}



