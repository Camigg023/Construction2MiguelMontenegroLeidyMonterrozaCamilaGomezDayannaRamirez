package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapter.in.validators.AppointmentValidator;
import app.domain.model.Appointment;
import app.domain.model.Patient;
import app.domain.model.User;

import java.util.Date;

@Component
public class AppointmentBuilder {

    @Autowired
    private AppointmentValidator appointmentValidator;

    public Appointment builder(String patientId, String doctorId, String date, String time,
                               String reason, String status, Patient patientEntity, User doctorEntity) throws Exception {

        Appointment appointment = new Appointment();

        // Validaciones
        appointment.setPatient(patientEntity); 
        appointment.setDoctor(doctorEntity);   
        appointment.setDate(appointmentValidator.dateValidator(date));
        appointment.setTime(appointmentValidator.timeValidator(time));
        appointment.setReason(appointmentValidator.reasonValidator(reason));
        appointment.setStatus(appointmentValidator.statusValidator(status));

        return appointment;
    }
}
