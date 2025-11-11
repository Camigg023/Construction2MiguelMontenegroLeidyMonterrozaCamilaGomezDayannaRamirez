package src.main.java.app.adapter.in.rest.request;

import app.domain.model.Procedure;
import app.domain.model.Patient;
import app.domain.model.User;
import lombok.Data;

import javax.validation.constraints.*;
import java.sql.Date;

@Data

public class OrderProcedureRequest {
    @NotNull(message = "El paciente es obligatorio")
    private Patient patient;

    @NotNull(message = "El doctor es obligatorio")
    private User doctor;

    @NotNull(message = "El procedimiento es obligatorio")
    private Procedure procedure;

    @Min(value = 1, message = "La cantidad mínima es 1")
    private int quantity;

    @NotBlank(message = "La frecuencia es obligatoria")
    private String frequency;

    @PositiveOrZero(message = "El costo unitario no puede ser negativo")
    private double unitCost;

    private int specialistCode;
    private Date date;
}
