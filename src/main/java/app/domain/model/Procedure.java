package src.main.java.app.domain.model;

public class Procedure {

    private long procedureCode;
    private String name;
    private String description;
    private boolean requiresSpecialist;
    private double baseCost;

    public Procedure(long procedureCode, String name, String description, boolean requiresSpecialist, double baseCost) {
        this.procedureCode = procedureCode;
        this.name = name;
        this.description = description;
        this.requiresSpecialist = requiresSpecialist;
        this.baseCost = baseCost;
    }

    public long getProcedureCode() {
        return procedureCode;
    }

    public void setProcedureCode(long procedureCode) {
        this.procedureCode = procedureCode;
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

    public boolean isRequiresSpecialist() {
        return requiresSpecialist;
    }

    public void setRequiresSpecialist(boolean requiresSpecialist) {
        this.requiresSpecialist = requiresSpecialist;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
}
