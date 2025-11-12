package src.main.java.app.domain.ports;

import src.main.java.app.domain.model.Appointment;
import java.sql.Date;
import java.util.List;

public interface AppointmentPort {

    void save(Appointment appointment) throws Exception;

    Appointment findById(int appointmentId) throws Exception;

    Appointment update(Appointment appointment) throws Exception;

    void delete(int appointmentId) throws Exception;

    List<Appointment> findByPatientId(int patientId) throws Exception;

    List<Appointment> findByDoctorId(int doctorId) throws Exception;

    List<Appointment> findByDate(Date date) throws Exception;

    List<Appointment> findAll() throws Exception;
}

