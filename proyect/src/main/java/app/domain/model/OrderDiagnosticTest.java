package src.main.java.app.domain.model;

import java.sql.Date;
import src.main.java.app.domain.model.emuns.StateOrder;


public class OrderDiagnosticTest {


    private int orderId;
    private Long itemId;
    private DiagnosticTest diagnosticTest;
    private int quantity;
    private boolean requiresSpecialist;
    private Integer specialistCode;
    private double cost;
    private double copay;
    private double insuranceCoverage;
    private StateOrder status;
    private String resultNotes;
    private Date creationDate;
    private Date resultDate;
    private User doctor;
    private Patient patient;
    private Visit visit;


    public OrderDiagnosticTest() {}

    public OrderDiagnosticTest(int orderId, Long itemId, DiagnosticTest diagnosticTest, int quantity,
                               boolean requiresSpecialist, Integer specialistCode, double cost,
                               double copay, double insuranceCoverage, StateOrder status,
                               String resultNotes, Date creationDate, Date resultDate,
                               User doctor, Patient patient, Visit visit) {

        this.orderId = orderId;
        this.itemId = itemId;
        this.diagnosticTest = diagnosticTest;
        this.quantity = (quantity > 0) ? quantity : 1;
        this.requiresSpecialist = requiresSpecialist;
        this.specialistCode = requiresSpecialist ? specialistCode : null;
        this.cost = cost;
        this.copay = copay;
        this.insuranceCoverage = insuranceCoverage;
        this.status = (status != null) ? status : StateOrder.IN_PROCESS;
        this.resultNotes = resultNotes;
        this.creationDate = (creationDate != null) ? creationDate : new Date(System.currentTimeMillis());
        this.resultDate = resultDate;
        this.doctor = doctor;
        this.patient = patient;
        this.visit = visit;
    }

    // 🔹 Getters y Setters
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Long getItemId() {
        return itemId;
    }
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public DiagnosticTest getDiagnosticTest() {
        return diagnosticTest;
    }
    public void setDiagnosticTest(DiagnosticTest diagnosticTest) {
        this.diagnosticTest = diagnosticTest;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 1;
    }

    public boolean isRequiresSpecialist() {
        return requiresSpecialist;
    }
    public void setRequiresSpecialist(boolean requiresSpecialist) {
        this.requiresSpecialist = requiresSpecialist;
    }

    public Integer getSpecialistCode() {
        return specialistCode;
    }
    public void setSpecialistCode(Integer specialistCode) {
        this.specialistCode = specialistCode;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCopay() {
        return copay;
    }
    public void setCopay(double copay) {
        this.copay = copay;
    }

    public double getInsuranceCoverage() {
        return insuranceCoverage;
    }
    public void setInsuranceCoverage(double insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }

    public StateOrder getStatus() {
        return status;
    }
    public void setStatus(StateOrder status) {
        this.status = status;
    }

    public String getResultNotes() {
        return resultNotes;
    }
    public void setResultNotes(String resultNotes) {
        this.resultNotes = resultNotes;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getResultDate() {
        return resultDate;
    }
    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }

    public User getDoctor() {
        return doctor;
    }
    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Visit getVisit() {
        return visit;
    }
    public void setVisit(Visit visit) {
        this.visit = visit;
    }
}


