package main.java.app.adapter.rest.request;


import lombok.Data;
import javax.validation.constraints.NotBlank;
@Data

public class AuthRequest {
    @NotBlank(message = "El nombre de usuario es obligatorio")
    private String userName;

    @NotBlank(message = "La contraseña es obligatoria")
    private String password;
}
