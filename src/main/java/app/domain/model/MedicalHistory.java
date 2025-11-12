package src.main.java.app.domain.model;

import java.util.Date;
import java.util.List;

public class MedicalHistory {

    private int id;
    private Patient patient;
    private String chiefComplaint;
    private String symptoms;
    private String diagnosis;
    private User doctor;
    private Date date;
    private List<OrderMedication> medications;
    private List<OrderProcedure> procedures;
    private List<OrderDiagnosticTest> diagnostics;
    private String observations;

    // 🔹 Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<OrderMedication> getMedications() {
        return medications;
    }

    public void setMedications(List<OrderMedication> medications) {
        this.medications = medications;
    }

    public List<OrderProcedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<OrderProcedure> procedures) {
        this.procedures = procedures;
    }

    public List<OrderDiagnosticTest> getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(List<OrderDiagnosticTest> diagnostics) {
        this.diagnostics = diagnostics;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}

