package src.main.java.app.domain.model;

import java.sql.Date;

public class OrderMedication {

    private int orderId;
    private int item;
    private Medication medication;
    private String dose;
    private String duration;
    private int quantity;
    private double unitCost;
    private double totalCost;
    private User doctor;
    private Patient patient;
    private Date date;
    private Double Cost;

    // 🔹 Constructor
    public OrderMedication(int orderId, int item, Medication medication, String dose, String duration,
                           int quantity, double unitCost, User doctor, Patient patient, Date date, Double Cost) {
        this.orderId = orderId;
        this.item = item;
        this.medication = medication;
        this.dose = dose;
        this.duration = duration;
        this.quantity = quantity > 0 ? quantity : 1;
        this.unitCost = unitCost > 0 ? unitCost : medication.getUnitCost();
        this.totalCost = this.quantity * this.unitCost;
        this.doctor = doctor;
        this.patient = patient;
        this.date = (date != null) ? date : new Date(System.currentTimeMillis());
        this.Cost = Cost;

    }

    public OrderMedication(int orderId, int item, Medication medication, String doseV, String durationV, int quantity, User doctor, Patient patient, Date sqlDate) {
    }

    // 🔹 Getters y Setters
    public int getOrderId() {
        return orderId;
    }
    public int getItem() {
        return item;
    }
    public Medication getMedication() {
        return medication;
    }
    public String getDose() {
        return dose;
    }
    public String getDuration() {
        return duration;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getUnitCost() {
        return unitCost;
    }
    public double getTotalCost() {
        return totalCost;
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


