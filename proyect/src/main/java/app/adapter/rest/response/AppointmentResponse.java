package src.main.java.app.adapter.rest.response;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.AppointmentStatus;
import app.domain.model.emuns.AppointmentType;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
@Builder

public class AppointmentResponse {
    private int appointmentId;
    private Date date;
    private Time time;
    private String reason;
    private AppointmentStatus status;
    private AppointmentType appointmentType;
    private Patient patient;
    private User doctor;
    private User administrative;
}