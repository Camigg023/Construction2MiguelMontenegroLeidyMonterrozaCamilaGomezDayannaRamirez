package app.domain.services;

import app.domain.model.Appointment;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.AppointmentPort;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateAppointment {
    @Autowired
    private  AppointmentPort appointmentPort;
    @Autowired
    private UserPort userPort;
    @Autowired
    private PatientPort patientPort;
    
    public void validateAppointment(Appointment appointment) throws Exception {
        User administrative = userPort.findByDocument(appointment.getDoctor());
        if (administrative == null || !administrative.getRole().equals(Role.ADMINISTRATIVESTAFF)) {
            throw new Exception("Las citas solo pueden ser creadas por el personal administrativo.");
        }
        
        Patient patient = patientPort.findById(appointment.getPatient());
        if (patient == null) {
            throw new Exception("La orden debe estar asociada a un paciente existente.");
        }
        
        User doctor = userPort.findByDocument(appointment.getDoctor());
        if (doctor == null) {
            throw new Exception("La cita debe tener un doctor asignado.");
        }

        appointment.setDoctor(doctor);
        appointment.setPatient(patient);
    }
    
    public void create (Appointment appointment) throws Exception {
        validateAppointment (appointment);
        appointmentPort.save(appointment);
    }


    
}
