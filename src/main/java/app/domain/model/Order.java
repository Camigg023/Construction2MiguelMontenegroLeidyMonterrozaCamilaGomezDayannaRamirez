package src.main.java.app.domain.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private Patient patient;
    private User doctor;
    private Date date;
    private String type;
    private int itemNumber;
    private String name;
    private String dose;
    private String treatmentDuration;
    private int repetitions;
    private String frequency;
    private boolean requiresSpecialist;
    private String specialistTypeId;
    private double cost;
    private boolean activePolicy;
    private String insuranceCompany;
    private String policyNumber;
    private Date policyEndDate;
    private double copay;
    private double totalCost;
    private String diagnostic;
    private String consultationReason;
    private String symptoms;
    private String notes;
    private String status;
    private int quantity;


    private List<OrderMedication> medications = new ArrayList<>();
    private List<OrderProcedure> procedures = new ArrayList<>();
    private List<OrderDiagnosticTest> diagnosticTests = new ArrayList<>();


    // 🔹 Getters y Setters
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getItemNumber() {
        return itemNumber;
    }
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDose() {
        return dose;
    }
    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getTreatmentDuration() {
        return treatmentDuration;
    }
    public void setTreatmentDuration(String treatmentDuration) {
        this.treatmentDuration = treatmentDuration;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRepetitions() {
        return repetitions;
    }
    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public String getFrequency() {
        return frequency;
    }
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public boolean isRequiresSpecialist() {
        return requiresSpecialist;
    }
    public void setRequiresSpecialist(boolean requiresSpecialist) {
        this.requiresSpecialist = requiresSpecialist;
    }

    public String getSpecialistTypeId() {
        return specialistTypeId;
    }
    public void setSpecialistTypeId(String specialistTypeId) {
        this.specialistTypeId = specialistTypeId;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isActivePolicy() {
        return activePolicy;
    }

    public void setActivePolicy(boolean activePolicy) {
        this.activePolicy = activePolicy;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }
    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Date getPolicyEndDate() {
        return policyEndDate;
    }
    public void setPolicyEndDate(Date policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public double getCopay() {
        return copay;
    }
    public void setCopay(double copay) {
        this.copay = copay;
    }

    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getDiagnostic() {
        return diagnostic;
    }
    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getConsultationReason() {
        return consultationReason;
    }
    public void setConsultationReason(String consultationReason) {
        this.consultationReason = consultationReason;
    }

    public String getSymptoms() {
        return symptoms;
    }
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
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

    public List<OrderDiagnosticTest> getDiagnosticTests() {
        return diagnosticTests;
    }
    public void setDiagnosticTests(List<OrderDiagnosticTest> diagnosticTests) {
        this.diagnosticTests = diagnosticTests;
    }

}

