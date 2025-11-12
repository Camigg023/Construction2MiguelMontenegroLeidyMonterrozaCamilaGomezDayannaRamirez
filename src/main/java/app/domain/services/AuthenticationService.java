package src.main.java.app.domain.services;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.auth.TokenResponseDto;
import src.main.java.app.domain.ports.AuthenticationPort;
import src.main.java.app.domain.ports.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.model.auth.AuthCredentials;

@Service
public class AuthenticationService {

    @Autowired
    private AuthenticationPort authenticationPort;

    @Autowired
    private UserPort userPort;


    public TokenResponseDto authenticate(AuthCredentials credentials) throws Exception{
        User user = this.getUserByUsername(credentials.getUsername());
        this.validatePassword(credentials.getPassword(), user.getPassword());
        return authenticationPort.authenticate(credentials, String.valueOf(user.getRole()));
    }

    private User getUserByUsername(String username)  throws Exception{
        User user = new User();
        user.setUserName(username);
    user = userPort.findByUserName(user );
        if (user == null) {
            throw new BusinessException("Usuario no encontrado");
        }
        return user;
    }

    private void validatePassword(String inputPassword, String storedPassword) throws Exception {
        if (!inputPassword.equals(storedPassword)) {
            throw new BusinessException("Contraseña incorrecta");
        }
    }
}
