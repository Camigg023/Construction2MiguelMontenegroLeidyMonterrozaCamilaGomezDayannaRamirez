package src.main.java.app.domain.model;

import java.util.Date;

public class VitalSigns {

    private int id;
    private double bodyTemperature;
    private int heartRate;
    private int respiratoryRate;
    private int systolicPressure;
    private int diastolicPressure;
    private int oxygenSaturation;
    private double weight;
    private double height;
    private double bmi;
    private Date recordedDate;
    private String notes;


    public VitalSigns() {
        this.recordedDate = new Date();
        this.bmi = 0.0;
    }


    public VitalSigns(int id, double bodyTemperature, int heartRate, int respiratoryRate,
                      int systolicPressure, int diastolicPressure, int oxygenSaturation,
                      double weight, double height, String notes) {

        this.id = id;
        this.bodyTemperature = bodyTemperature;
        this.heartRate = heartRate;
        this.respiratoryRate = respiratoryRate;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.oxygenSaturation = oxygenSaturation;
        this.weight = weight;
        this.height = height;
        this.notes = notes;
        this.recordedDate = new Date();
        this.bmi = calculateBMI();
    }


    private double calculateBMI() {
        if (height > 0) {
            return Math.round((weight / (height * height)) * 10.0) / 10.0;
        }
        return 0.0;
    }

    // 🔹 Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public int getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(int diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public int getOxygenSaturation() {
        return oxygenSaturation;
    }

    public void setOxygenSaturation(int oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.bmi = calculateBMI();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.bmi = calculateBMI();
    }

    public double getBmi() {
        return bmi;
    }

    public Date getRecordedDate() {
        return recordedDate;
    }

    public void setRecordedDate(Date recordedDate) {
        this.recordedDate = recordedDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
