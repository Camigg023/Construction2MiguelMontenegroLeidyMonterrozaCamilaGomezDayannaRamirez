package src.main.java.app.domain.model;

public class Medication {

    private int medicationId;
    private String name;
    private String description;
    private String presentation;
    private String standardDose;
    private String unit;
    private double unitCost;
    private boolean available;

    public Medication() {
    }

    public Medication(int medicationId, String name, String description, String presentation, String standardDose, String unit, double unitCost, boolean available) {
        this.medicationId = medicationId;
        this.name = name;
        this.description = description;
        this.presentation = presentation;
        this.standardDose = standardDose;
        this.unit = unit;
        this.unitCost = unitCost;
        this.available = available;
    }

    // Getters y Setters
    public int getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getStandardDose() {
        return standardDose;
    }

    public void setStandardDose(String standardDose) {
        this.standardDose = standardDose;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
