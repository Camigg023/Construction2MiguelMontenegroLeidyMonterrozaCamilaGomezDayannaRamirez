package src.main.java.app.adapter.in.rest.request;

import app.domain.model.EmergencyContact;
import app.domain.model.MedicalInsurance;
import lombok.Data;

import javax.validation.constraints.*;
import java.sql.Date;

@Data

public class PatientRequest {
    @NotBlank(message = "El nombre completo es obligatorio")
    private String fullName;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    private Date birthday;

    @NotBlank(message = "La dirección es obligatoria")
    private String direction;

    @NotNull(message = "El número de teléfono es obligatorio")
    @Digits(integer = 15, fraction = 0, message = "Número de teléfono inválido")
    private Long telephoneNumber;

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Correo electrónico inválido")
    private String email;

    @NotBlank(message = "El género es obligatorio")
    private String gender;

    private MedicalInsurance medicalInsurance;

    private EmergencyContact emergencyContact;
}
