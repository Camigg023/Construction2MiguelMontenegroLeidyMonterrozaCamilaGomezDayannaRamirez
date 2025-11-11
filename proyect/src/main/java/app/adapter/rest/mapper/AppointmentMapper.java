package src.main.java.app.adapter.rest.mapper;

import app.adapter.rest.request.AppointmentRequest;
import app.adapter.rest.response.AppointmentResponse;
import app.domain.model.Appointment;
import lombok.experimental.UtilityClass;

@UtilityClass

public class AppointmentMapper {
    public Appointment toDomain(AppointmentRequest request) {
        Appointment appointment = new Appointment();
        appointment.setDate(request.getDate());
        appointment.setTime(request.getTime());
        appointment.setReason(request.getReason());
        appointment.setStatus(request.getStatus());
        appointment.setAppointmentType(request.getAppointmentType());
        appointment.setPatient(request.getPatient());
        appointment.setDoctor(request.getDoctor());
        appointment.setAdministrative(request.getAdministrative());
        return appointment;
    }

    public AppointmentResponse toResponse(Appointment appointment) {
        return AppointmentResponse.builder()
                .appointmentId(appointment.getAppointmentId())
                .date(appointment.getDate())
                .time(appointment.getTime())
                .reason(appointment.getReason())
                .status(appointment.getStatus())
                .appointmentType(appointment.getAppointmentType())
                .patient(appointment.getPatient())
                .doctor(appointment.getDoctor())
                .administrative(appointment.getAdministrative())
                .build();
    }
}