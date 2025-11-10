package src.main.java.app.domain.model;

public class DiagnosticTest {

    private long diagnosticTestId;
    private String name;
    private String description;
    private boolean requiresSpecialist;
    private double baseCost;
    private String preparationInstructions;
    private boolean active;

    public DiagnosticTest() {}

    public DiagnosticTest(long diagnosticTestId, String name, String description,
                          boolean requiresSpecialist, double baseCost, String preparationInstructions, boolean active) {
        this.diagnosticTestId = diagnosticTestId;
        this.name = name;
        this.description = description;
        this.requiresSpecialist = requiresSpecialist;
        this.baseCost = baseCost;
        this.preparationInstructions = preparationInstructions;
        this.active = active;
    }


    public long getDiagnosticTestId() {
        return diagnosticTestId;
    }

    public void setDiagnosticTestId(long diagnosticTestId) {
        this.diagnosticTestId = diagnosticTestId;
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

    public String getPreparationInstructions() {
        return preparationInstructions;
    }

    public void setPreparationInstructions(String preparationInstructions) {
        this.preparationInstructions = preparationInstructions;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "DiagnosticTest{" +
                "diagnosticTestId=" + diagnosticTestId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", requiresSpecialist=" + requiresSpecialist +
                ", baseCost=" + baseCost +
                ", preparationInstructions='" + preparationInstructions + '\'' +
                ", active=" + active +
                '}';
    }
}
