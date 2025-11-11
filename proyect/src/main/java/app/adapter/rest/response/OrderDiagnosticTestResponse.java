package src.main.java.app.adapter.rest.response;

import app.domain.model.DiagnosticTest;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.Visit;
import app.domain.model.emuns.StateOrder;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Data
@Builder

public class OrderDiagnosticTestResponse {
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
}
}
