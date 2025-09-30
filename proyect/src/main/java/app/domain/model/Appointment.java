package app.domain.model;

import java.util.Date;

public class Appointment {
    
    
    private int appointmentId;
    
    private Date date;
    private String time;
    private String reason;
    private String status;
    private Patient patient;
    private User doctor;
    
    public Appointment() {
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public void setAdministrative(User administrative) {
        this.administrative = administrative;
    }

    public void setAppointmentType(String appointmentType) {
        this.appointmentType = appointmentType;
    }
    private User administrative;
    private String appointmentType;

    public int getAppointmentId() {
        return appointmentId;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public Patient getPatient() {
        return patient;
    }

    public User getDoctor() {
        return doctor;
    }

    public User getAdministrative() {
        return administrative;
    }

    public String getAppointmentType() {
        return appointmentType;
    }
    

    

}
