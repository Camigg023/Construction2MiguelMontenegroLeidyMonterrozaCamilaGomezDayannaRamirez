package src.main.java.app.domain.services.HumanResources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.ports.UserPort;

@Service
public class CreateUser {

    @Autowired
    private UserPort userPort;

    public void create(User user) throws Exception {

        if (userPort.findByIdentification(user.getIdentification()) != null) {
            throw new BusinessException("Ya existe un usuario registrado con esa identificación.");
        }

        if (userPort.findByUserName(user.getUserName()) != null) {
            throw new BusinessException("Ya existe un usuario registrado con ese nombre de usuario.");
        }



        userPort.save(user);
    }
}
