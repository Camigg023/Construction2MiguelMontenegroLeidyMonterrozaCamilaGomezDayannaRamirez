package src.main.java.app.domain.services.HumanResources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import src.main.java.app.domain.model.User;
import src.main.java.app.domain.ports.UserPort;

@Service
public class ListAllUsers {

    @Autowired
    private UserPort userPort;

    public List<User> listAll() throws Exception {
        return userPort.findAll();
    }
}
