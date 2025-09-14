
package app.domain.services;

import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateEmployee {
    @Autowired
    private UserPort userPort;
    
    public void create (User user) throws Exception{
        if (!user.getRole().equals(Role.HUMANRESOURCE)) {
            throw new Exception("Solo el personal de recursos humanos pueden crear usuarios");
        }
        if (userPort.findByDocument(user) != null){
            throw new Exception("Ya existe esa cedula en el sistema");
        }
        
        if (userPort.findByUserName(user) != null){
            throw new Exception ("Ya existe ese nombre de usuario en el sistema");
        }
    }
}
