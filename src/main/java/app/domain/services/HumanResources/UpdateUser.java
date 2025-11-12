package src.main.java.app.domain.services.HumanResources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.ports.UserPort;

@Service
public class UpdateUser {

    @Autowired
    private UserPort userPort;

    public void update(User user) throws Exception {
        User existing = userPort.findByIdentification(user.getIdentification());
        if (existing == null) {
            throw new BusinessException("No se encontró un usuario con esa identificación.");
        }


        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        existing.setAddress(user.getAddress());
        existing.setUserName(user.getUserName());
        existing.setPassword(user.getPassword());
        existing.setPhone(user.getPhone());
        existing.setBirthDay(user.getBirthDay());
        existing.setRole(user.getRole());

        userPort.update(existing);
    }
}
