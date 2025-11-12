package src.main.java.app.adapter.in.rest.request;

import app.domain.model.OrderDiagnosticTest;
import app.domain.model.OrderMedication;
import app.domain.model.OrderProcedure;
import app.domain.model.Patient;
import app.domain.model.User;
import lombok.Data;

import javax.validation.constraints.*;
import java.sql.Date;
import java.util.List;

@Data

public class OrderRequest {
    @NotNull(message = "El paciente es obligatorio")
    private Patient patient;

    @NotNull(message = "El doctor es obligatorio")
    private User doctor;

    @NotNull(message = "La fecha es obligatoria")
    private Date date;

    @NotBlank(message = "El tipo de orden es obligatorio")
    private String type;

    @Min(value = 1, message = "El número de ítem debe ser mayor que 0")
    private int itemNumber;

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    private String dose;
    private String treatmentDuration;

    @Min(0)
    private int repetitions;

    private String frequency;
    private boolean requiresSpecialist;
    private String specialistTypeId;

    @PositiveOrZero
    private double cost;

    private boolean activePolicy;
    private String insuranceCompany;
    private String policyNumber;
    private Date policyEndDate;
    private double copay;
    private double totalCost;
    private String diagnostic;
    private String consultationReason;
    private String symptoms;
    private String notes;
    private String status;
    private int quantity;

    private List<OrderMedication> medications;
    private List<OrderProcedure> procedures;
    private List<OrderDiagnosticTest> diagnosticTests;
}
