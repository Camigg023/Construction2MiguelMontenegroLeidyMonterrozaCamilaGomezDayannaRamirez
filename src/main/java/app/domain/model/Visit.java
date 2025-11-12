package src.main.java.app.domain.model;

import java.util.Date;
import java.util.List;

public class Visit {

    private int visitId;
    private Date visitDate;
    private String startTime;
    private String endTime;
    private Patient patient;
    private User doctor;
    private VitalSigns vitalSigns;
    private List<OrderMedication> medications;
    private List<OrderProcedure> procedures;
    private List<OrderDiagnosticTest> diagnosticTests;
    private String notes;
    private String status; // "Scheduled", "In Progress", "Completed", "Cancelled"
    private double totalCost;

    // 🔹 Constructor vacío
    public Visit() {
        this.status = "Scheduled";
        this.totalCost = 0.0;
    }

    // 🔹 Constructor completo
    public Visit(int visitId, Date visitDate, String startTime, String endTime, Patient patient, User doctor,
                 VitalSigns vitalSigns, List<OrderMedication> medications, List<OrderProcedure> procedures,
                 List<OrderDiagnosticTest> diagnosticTests, String notes, String status) {

        this.visitId = visitId;
        this.visitDate = visitDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.patient = patient;
        this.doctor = doctor;
        this.vitalSigns = vitalSigns;
        this.medications = medications;
        this.procedures = procedures;
        this.diagnosticTests = diagnosticTests;
        this.notes = notes;
        this.status = status != null ? status : "Scheduled";
        this.totalCost = calculateTotalCost();
    }

    // 🔹 Calcula el costo total de la visita sumando todas las órdenes
    private double calculateTotalCost() {
        double total = 0.0;

        if (medications != null) {
            for (OrderMedication med : medications) {
                total += med.getCost();
            }
        }
        if (procedures != null) {
            for (OrderProcedure proc : procedures) {
                total += proc.getCost();
            }
        }
        if (diagnosticTests != null) {
            for (OrderDiagnosticTest test : diagnosticTests) {
                total += test.getCost();
            }
        }
        return total;
    }

    // 🔹 Getters y Setters
    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public List<OrderMedication> getMedications() {
        return medications;
    }

    public void setMedications(List<OrderMedication> medications) {
        this.medications = medications;
        this.totalCost = calculateTotalCost();
    }

    public List<OrderProcedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<OrderProcedure> procedures) {
        this.procedures = procedures;
        this.totalCost = calculateTotalCost();
    }

    public List<OrderDiagnosticTest> getDiagnosticTests() {
        return diagnosticTests;
    }

    public void setDiagnosticTests(List<OrderDiagnosticTest> diagnosticTests) {
        this.diagnosticTests = diagnosticTests;
        this.totalCost = calculateTotalCost();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
