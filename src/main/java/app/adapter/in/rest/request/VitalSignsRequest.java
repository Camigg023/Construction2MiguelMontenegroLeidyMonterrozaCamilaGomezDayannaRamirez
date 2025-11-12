package src.main.java.app.adapter.in.rest.request;

import lombok.Data;
import javax.validation.constraints.*;
import java.util.Date;

@Data

public class VitalSignsRequest {
    @NotNull(message = "La temperatura corporal es obligatoria")
    private Double bodyTemperature;

    @NotNull(message = "La frecuencia cardíaca es obligatoria")
    private Integer heartRate;

    @NotNull(message = "La frecuencia respiratoria es obligatoria")
    private Integer respiratoryRate;

    @NotNull(message = "La presión sistólica es obligatoria")
    private Integer systolicPressure;

    @NotNull(message = "La presión diastólica es obligatoria")
    private Integer diastolicPressure;

    @NotNull(message = "La saturación de oxígeno es obligatoria")
    private Integer oxygenSaturation;

    @NotNull(message = "El peso es obligatorio")
    private Double weight;

    @NotNull(message = "La altura es obligatoria")
    private Double height;

    private String notes;
}
