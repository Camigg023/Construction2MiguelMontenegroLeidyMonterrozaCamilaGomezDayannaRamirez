package app.adapter.in.rest.request;

import lombok.Data;
import src.main.java.app.domain.model.emuns.Role;
import javax.validation.constraints.*;
import java.sql.Date;

@Data
 
public class UserRequest {
    @NotNull(message = "La identificación es obligatoria")
    private Long identification;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 150, message = "El nombre no puede superar 150 caracteres")
    private String name;

    @Email(message = "Debe ser un correo válido")
    @NotBlank(message = "El correo es obligatorio")
    private String email;

    @Size(max = 150, message = "La dirección no puede superar 150 caracteres")
    private String address;

    @NotBlank(message = "El nombre de usuario es obligatorio")
    @Size(max = 15, message = "El usuario no puede superar 15 caracteres")
    private String userName;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 8, message = "La contraseña debe tener mínimo 8 caracteres")
    private String password;

    @NotNull(message = "El teléfono es obligatorio")
    @Digits(integer = 10, fraction = 0, message = "El teléfono debe tener 10 dígitos")
    private Long phone;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    private Date birthDay;

    @NotNull(message = "El rol es obligatorio")
    private Role role;
}