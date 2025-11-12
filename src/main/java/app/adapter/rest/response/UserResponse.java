package src.main.java.app.adapter.rest.response;

import lombok.Data;
import src.main.java.app.domain.model.emuns.Role;
import java.sql.Date;

@Data

public class UserResponse {
    private Long identification;
    private String name;
    private String email;
    private String address;
    private String userName;
    private Long phone;
    private Date birthDay;
    private Role role;
}
