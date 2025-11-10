package src.main.java.app.domain.model;

import java.util.Date;
import java.util.List;

public class Bill {

    private String item;
    private Long invoiceId;
    private Date date;
    private Double totalCost;
    private boolean coveredByInsurance;
    private Double copay;
    private Double insuranceCoverageAmount;
    private Double patientCharge;
    private Patient patient;
    private User doctor;
    private MedicalInsurance medicalInsurance;
    private Visit visit;
    private List<OrderMedication> medications;
    private List<OrderProcedure> procedures;
    private List<OrderDiagnosticTest> diagnosticTests;


    public Bill() {}


    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isCoveredByInsurance() {
        return coveredByInsurance;
    }

    public void setCoveredByInsurance(boolean coveredByInsurance) {
        this.coveredByInsurance = coveredByInsurance;
    }

    public Double getCopay() {
        return copay;
    }

    public void setCopay(Double copay) {
        this.copay = copay;
    }

    public Double getInsuranceCoverageAmount() {
        return insuranceCoverageAmount;
    }

    public void setInsuranceCoverageAmount(Double insuranceCoverageAmount) {
        this.insuranceCoverageAmount = insuranceCoverageAmount;
    }

    public Double getPatientCharge() {
        return patientCharge;
    }

    public void setPatientCharge(Double patientCharge) {
        this.patientCharge = patientCharge;
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

    public MedicalInsurance getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(MedicalInsurance medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}

