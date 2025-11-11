package src.main.java.app.adapter.in.rest.request;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.AppointmentStatus;
import app.domain.model.emuns.AppointmentType;
import lombok.Data;

import javax.validation.constraints.*;
import java.sql.Date;
import java.sql.Time;

@Data

public class AppointmentRequest {
    @NotNull(message = "La fecha es obligatoria")
    private Date date;

    @NotNull(message = "La hora es obligatoria")
    private Time time;

    @Size(max = 250, message = "La razón no puede superar 250 caracteres")
    private String reason;

    @NotNull(message = "El estado de la cita es obligatorio")
    private AppointmentStatus status;

    @NotNull(message = "El tipo de cita es obligatorio")
    private AppointmentType appointmentType;

    @NotNull(message = "El paciente es obligatorio")
    private Patient patient;

    @NotNull(message = "El doctor es obligatorio")
    private User doctor;

    @NotNull(message = "El administrativo es obligatorio")
    private User administrative;

}