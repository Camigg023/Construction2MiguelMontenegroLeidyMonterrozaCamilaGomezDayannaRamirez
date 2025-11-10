package src.main.java.app.domain.model;

import src.main.java.app.domain.model.emuns.AppointmentStatus;
import src.main.java.app.domain.model.emuns.AppointmentType;

import java.sql.Date;
import java.sql.Time;

public class Appointment {

    private int appointmentId;
    private Date date;
    private Time time;
    private String reason;
    private AppointmentStatus status;
    private AppointmentType appointmentType;

    private Patient patient;
    private User doctor;
    private User administrative;


    public Appointment() {}


    public Appointment(int appointmentId, Date date, Time time, String reason,
                       AppointmentStatus status, AppointmentType appointmentType,
                       Patient patient, User doctor, User administrative) {

        this.appointmentId = appointmentId;
        this.date = date;
        this.time = time;
        this.reason = reason;
        this.status = status;
        this.appointmentType = appointmentType;
        this.patient = patient;
        this.doctor = doctor;
        this.administrative = administrative;
    }



    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public AppointmentType getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(AppointmentType appointmentType) {
        this.appointmentType = appointmentType;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public User getAdministrative() {
        return administrative;
    }

    public void setAdministrative(User administrative) {
        this.administrative = administrative;
    }
}
