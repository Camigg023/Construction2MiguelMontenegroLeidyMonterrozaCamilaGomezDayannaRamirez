package src.main.java.app.domain.services.HumanResources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.ports.UserPort;

@Service
public class GetUserById {

    @Autowired
    private UserPort userPort;

    public User getById(User identification) throws Exception {
        User id = identification;
        User user = userPort.findByIdentification(id);

        if (user == null) {
            throw new BusinessException("Usuario no encontrado con esa identificación.");
        }

        return user;
    }
}
