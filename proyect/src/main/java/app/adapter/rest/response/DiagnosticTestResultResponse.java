package src.main.java.app.adapter.rest.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class DiagnosticTestResultResponse {
    private long diagnosticTestId;
    private String name;
    private String description;
    private boolean requiresSpecialist;
    private double baseCost;
    private String preparationInstructions;
    private boolean active;
}

