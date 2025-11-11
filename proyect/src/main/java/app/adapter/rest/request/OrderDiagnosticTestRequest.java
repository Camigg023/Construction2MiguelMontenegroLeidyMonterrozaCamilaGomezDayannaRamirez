package src.main.java.app.adapter.rest.request;

import app.domain.model.DiagnosticTest;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.Visit;
import app.domain.model.emuns.StateOrder;
import lombok.Data;

import java.sql.Date;

@Data

public class OrderDiagnosticTestRequest {
    private Patient patient;
    private User doctor;
    private Visit visit;
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

    // Campos internos
    private String internalComments;
    private boolean urgentFlag;
}
