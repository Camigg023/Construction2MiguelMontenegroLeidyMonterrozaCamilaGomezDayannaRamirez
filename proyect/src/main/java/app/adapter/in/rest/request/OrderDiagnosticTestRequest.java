package src.main.java.app.adapter.in.rest.request;


import app.domain.model.DiagnosticTest;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.Visit;
import app.domain.model.emuns.StateOrder;
import lombok.Data;

import javax.validation.constraints.*;
import java.sql.Date;

@Data

public class OrderDiagnosticTestRequest {
    @NotNull(message = "El paciente es obligatorio")
    private Patient patient;

    @NotNull(message = "El doctor es obligatorio")
    private User doctor;

    @NotNull(message = "La visita es obligatoria")
    private Visit visit;

    @NotNull(message = "El examen diagnóstico es obligatorio")
    private DiagnosticTest diagnosticTest;

    @Min(value = 1, message = "La cantidad debe ser al menos 1")
    private int quantity;

    private boolean requiresSpecialist;

    private Integer specialistCode;

    @PositiveOrZero(message = "El costo no puede ser negativo")
    private double cost;

    @PositiveOrZero(message = "El copago no puede ser negativo")
    private double copay;

    @PositiveOrZero(message = "El valor cubierto por seguro no puede ser negativo")
    private double insuranceCoverage;

    private StateOrder status;

    private String resultNotes;

    private Date creationDate;

    private Date resultDate;
}