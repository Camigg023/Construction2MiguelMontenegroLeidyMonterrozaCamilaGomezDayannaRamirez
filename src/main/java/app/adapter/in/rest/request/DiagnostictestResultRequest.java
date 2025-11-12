package src.main.java.app.adapter.in.rest.request;


import lombok.Data;

import javax.validation.constraints.*;

@Data

public class DiagnostictestResultRequest {
    @NotBlank(message = "El nombre del examen es obligatorio")
    @Size(max = 100, message = "El nombre no puede superar 100 caracteres")
    private String name;

    @Size(max = 250, message = "La descripción no puede superar 250 caracteres")
    private String description;

    private boolean requiresSpecialist;

    @NotNull(message = "El costo base es obligatorio")
    @PositiveOrZero(message = "El costo base no puede ser negativo")
    private Double baseCost;

    @Size(max = 500, message = "Las instrucciones de preparación no pueden superar 500 caracteres")
    private String preparationInstructions;

    private boolean active;
}
