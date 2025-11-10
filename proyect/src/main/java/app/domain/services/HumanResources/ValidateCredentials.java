package src.main.java.app.domain.services.HumanResources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.ports.UserPort;

@Service
public class ValidateCredentials {

    @Autowired
    private UserPort userPort;

    public User validateCredentials(String username, String password) throws Exception {
        User user = userPort.findByUserName(username);

        if (user == null) {
            throw new BusinessException("El nombre de usuario no existe.");
        }

        if (!user.getPassword().equals(password)) {
            throw new BusinessException("La contraseña es incorrecta.");
        }

        return user;
    }
}
