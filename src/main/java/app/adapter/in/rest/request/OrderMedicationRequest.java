package src.main.java.app.adapter.in.rest.request;

import app.domain.model.Medication;
import app.domain.model.Patient;
import app.domain.model.User;
import lombok.Data;

import javax.validation.constraints.*;
import java.sql.Date;

@Data

public class OrderMedicationRequest {
    @NotNull(message = "El paciente es obligatorio")
    private Patient patient;

    @NotNull(message = "El doctor es obligatorio")
    private User doctor;

    @NotNull(message = "El medicamento es obligatorio")
    private Medication medication;

    @NotBlank(message = "La dosis es obligatoria")
    private String dose;

    @NotBlank(message = "La duración es obligatoria")
    private String duration;

    @Min(value = 1, message = "La cantidad mínima es 1")
    private int quantity;

    @PositiveOrZero(message = "El costo unitario no puede ser negativo")
    private double unitCost;

    private Date date;
}
