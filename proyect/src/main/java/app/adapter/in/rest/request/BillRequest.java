package src.main.java.app.adapter.in.rest.request;

import app.domain.model.*;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Data

public class BillRequest {
    @NotNull(message = "La fecha es obligatoria")
    private Date date;

    @NotNull(message = "El costo total es obligatorio")
    @PositiveOrZero(message = "El costo total no puede ser negativo")
    private Double totalCost;

    private boolean coveredByInsurance;

    @PositiveOrZero(message = "El copago no puede ser negativo")
    private Double copay;

    @PositiveOrZero(message = "El monto cubierto por seguro no puede ser negativo")
    private Double insuranceCoverageAmount;

    @PositiveOrZero(message = "El cargo al paciente no puede ser negativo")
    private Double patientCharge;

    @NotNull(message = "El paciente es obligatorio")
    private Patient patient;

    @NotNull(message = "El doctor es obligatorio")
    private User doctor;

    private MedicalInsurance medicalInsurance;

    private Visit visit;

    private List<OrderMedication> medications;

    private List<OrderProcedure> procedures;

    private List<OrderDiagnosticTest> diagnosticTests;

    @Size(max = 250, message = "El ítem no puede superar 250 caracteres")
    private String item;
}