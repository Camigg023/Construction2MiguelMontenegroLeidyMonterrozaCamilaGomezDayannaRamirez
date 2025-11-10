package src.main.java.app.domain.services.HumanResources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.ports.UserPort;

@Service
public class DeleteUser {

    @Autowired
    private UserPort userPort;

    public void delete(User identification) throws Exception {
        User id = identification;

        if (userPort.findByIdentification(id) == null) {
            throw new BusinessException("No se encontró un usuario con esa identificación.");
        }

        userPort.delete(id);
    }
}
