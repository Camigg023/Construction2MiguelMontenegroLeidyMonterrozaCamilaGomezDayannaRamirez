package src.main.java.app.adapter.in.rest.request;

import lombok.Data;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;
import src.main.java.app.domain.model.*;

@Data

public class VisitRequest {
    @NotNull(message = "La fecha de la visita es obligatoria")
    private Date visitDate;

    @NotBlank(message = "La hora de inicio es obligatoria")
    private String startTime;

    @NotBlank(message = "La hora de fin es obligatoria")
    private String endTime;

    @NotNull(message = "El paciente es obligatorio")
    private Patient patient;

    @NotNull(message = "El doctor es obligatorio")
    private User doctor;

    private VitalSigns vitalSigns;

    private List<OrderMedication> medications;

    private List<OrderProcedure> procedures;

    private List<OrderDiagnosticTest> diagnosticTests;

    @Size(max = 500, message = "Las notas no pueden superar 500 caracteres")
    private String notes;

    @NotBlank(message = "El estado es obligatorio")
    private String status;
}