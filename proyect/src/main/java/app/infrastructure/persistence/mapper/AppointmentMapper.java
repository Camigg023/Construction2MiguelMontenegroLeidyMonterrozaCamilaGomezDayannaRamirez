package app.infrastructure.persistence.mapper;

import app.domain.model.Appointment;
import app.domain.model.Patient;
import app.domain.model.User;
import app.infrastructure.persistence.entities.AppointmentEntity;

public class AppointmentMapper {

    public static AppointmentEntity toEntity(Appointment appointment) {
        if (appointment == null) {
            return null;
        }
        AppointmentEntity entity = new AppointmentEntity();

       
        entity.setAppointmentId((long) appointment.getAppointmentId());
        entity.setDate(appointment.getDate());
        entity.setTime(appointment.getTime());
        entity.setReason(appointment.getReason());
        entity.setStatus(appointment.getStatus());

      
        entity.setPatient(appointment.getPatient());
        entity.setDoctor(appointment.getDoctor());

        return entity;
    }

    public static Appointment toDomain(AppointmentEntity entity) {
        if (entity == null) {
            return null;
        }
        Appointment appointment = new Appointment();

        appointment.setAppointmentId(entity.getAppointmentId().intValue());
        appointment.setDate(entity.getDate());
        appointment.setTime(entity.getTime());
        appointment.setReason(entity.getReason());
        appointment.setStatus(entity.getStatus());

        appointment.setPatient(entity.getPatient());
        appointment.setDoctor(entity.getDoctor());

        
        appointment.setAdministrative(null);
        appointment.setAppointmentType(null);

        return appointment;
    }
}

