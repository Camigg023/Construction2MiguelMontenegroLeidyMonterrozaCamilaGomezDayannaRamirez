package src.main.java.app.adapter.in.rest.request;

import app.domain.model.Patient;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Data

public class MedicalInsuranceRequest {
    @NotBlank(message = "El número de póliza es obligatorio")
    @Size(max = 50, message = "El número de póliza no puede superar 50 caracteres")
    private String policyNumber;

    @NotBlank(message = "La compañía es obligatoria")
    @Size(max = 100, message = "El nombre de la compañía no puede superar 100 caracteres")
    private String company;

    @NotNull(message = "La fecha de vigencia es obligatoria")
    private Date validity;

    @NotNull(message = "El estado es obligatorio")
    private Boolean status;

    @NotNull(message = "El paciente es obligatorio")
    private Patient patient;
}