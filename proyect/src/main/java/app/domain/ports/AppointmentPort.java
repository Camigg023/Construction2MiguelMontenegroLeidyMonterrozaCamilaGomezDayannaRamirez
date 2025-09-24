package app.domain.ports;

import app.domain.model.Appointment;
import java.util.Date;
import java.util.List;

public interface AppointmentPort {

    
    public void save(Appointment appointment) throws Exception;

    
    public Appointment findById(int appointmentId) throws Exception;

    
    public Appointment update(Appointment appointment) throws Exception;

    
    public void delete(int appointmentId) throws Exception;

    
    List<Appointment> findByPatientId(Long patientId) throws Exception;

    
    List<Appointment> findByDoctorId(Long doctorId) throws Exception;

    
    List<Appointment> findByDate(Date date) throws Exception;

   
    List<Appointment> findAll() throws Exception;
}
