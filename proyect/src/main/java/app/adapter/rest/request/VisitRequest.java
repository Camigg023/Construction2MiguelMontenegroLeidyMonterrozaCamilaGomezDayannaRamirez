package src.main.java.app.adapter.rest.request;

import lombok.Data;
import java.util.Date;
import java.util.List;
import src.main.java.app.domain.model.*;

@Data

public class VisitRequest {
    private int visitId;
    private Date visitDate;
    private String startTime;
    private String endTime;
    private Patient patient;
    private User doctor;
    private VitalSigns vitalSigns;
    private List<OrderMedication> medications;
    private List<OrderProcedure> procedures;
    private List<OrderDiagnosticTest> diagnosticTests;
    private String notes;
    private String status;
    private double totalCost;
}
