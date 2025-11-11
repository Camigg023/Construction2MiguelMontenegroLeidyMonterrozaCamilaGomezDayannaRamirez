package src.main.java.app.adapter.rest.request;


import lombok.Data;

@Data

public class DiagnosticTestResultRequest {
    private String name;
    private String description;
    private boolean requiresSpecialist;
    private Double baseCost;
    private String preparationInstructions;
    private boolean active;

    private String internalNotes;
    private boolean urgentFlag;
}