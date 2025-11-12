package src.main.java.app.domain.model;

import java.sql.Date;

public class OrderProcedure {

    private int orderId;
    private int item;
    private Procedure procedure;
    private int quantity;
    private String frequency;
    private double unitCost;
    private double totalCost;
    private int specialistCode;
    private User doctor;
    private Patient patient;
    private Date date;
    private Double Cost;

    public OrderProcedure(int orderId, int item, Procedure procedure, int quantity,
                          String frequency, double unitCost, int specialistCode,
                          User doctor, Patient patient, Date date, Double Cost) {
        this.orderId = orderId;
        this.item = item;
        this.procedure = procedure;
        this.quantity = quantity > 0 ? quantity : 1;
        this.frequency = frequency;
        this.unitCost = (unitCost > 0) ? unitCost : procedure.getBaseCost();
        this.totalCost = this.quantity * this.unitCost;
        this.specialistCode = specialistCode;
        this.doctor = doctor;
        this.patient = patient;
        this.date = (date != null) ? date : new Date(System.currentTimeMillis());
        this.Cost = Cost;
    }

    public OrderProcedure(long orderId, Procedure validatedProcedure, int quantity, String validatedFrequency, User validatedDoctor, Patient validatedPatient, Date validatedDate, double validatedUnitCost, int validatedSpecialistCode) {
    }

    // 🔹 Getters y Setters
    public int getOrderId() {
        return orderId;
    }
    public int getItem() {
        return item;
    }
    public Procedure getProcedure() {
        return procedure;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getFrequency() {
        return frequency;
    }
    public double getUnitCost() {
        return unitCost;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public int getSpecialistCode() {
        return specialistCode;
    }
    public User getDoctor() {
        return doctor;
    }
    public Patient getPatient() {
        return patient;
    }
    public Date getDate() {
        return date;
    }
    public Double getCost() {
        return Cost;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


}
