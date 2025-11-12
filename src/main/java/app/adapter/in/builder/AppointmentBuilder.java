package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.java.app.adapter.in.validators.AppointmentValidator;
import src.main.java.app.adapter.in.validators.PatientValidator;
import src.main.java.app.adapter.in.validators.UserValidator;
import src.main.java.app.domain.model.Appointment;
import src.main.java.app.domain.model.Patient;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.model.emuns.AppointmentStatus;
import src.main.java.app.domain.model.emuns.AppointmentType;

@Component
public class AppointmentBuilder {

    @Autowired
    private AppointmentValidator appointmentValidator;

    @Autowired
    private PatientValidator patientValidator;

    @Autowired
    private UserValidator userValidator;

    public Appointment build(String appointmentId, String date, String time, String reason, AppointmentStatus status, AppointmentType appointmentType, String patientDocument, String doctorDocument, String adminDocument)
     throws Exception {

        Appointment appointment = new Appointment();


        appointment.setAppointmentId(appointmentValidator.idValidator(appointmentId));
        appointment.setDate(appointmentValidator.dateValidator(date));
        appointment.setTime(appointmentValidator.timeValidator(time));
        appointment.setReason(appointmentValidator.reasonValidator(reason));
        appointment.setStatus(status);
        appointment.setAppointmentType(appointmentType);


        Patient patient = new Patient();
        patient.setIdPatient(patientValidator.documentValidator(patientDocument));
        appointment.setPatient(patient);

        User doctor = new User();
        doctor.setIdentification(userValidator.identificationValidator(doctor.getIdentification()));
        appointment.setDoctor(doctor);

        User administrative = new User();
        administrative.setIdentification(userValidator.identificationValidator(administrative.getIdentification()));
        appointment.setAdministrative(administrative);

        return appointment;
    }
}







