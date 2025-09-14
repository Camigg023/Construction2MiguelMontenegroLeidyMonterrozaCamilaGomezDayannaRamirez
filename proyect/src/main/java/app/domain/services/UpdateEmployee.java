
package app.domain.services;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateEmployee {
    @Autowired
    private UserPort  userPort;
    
    public User updateE(User user) throws Exception {
        
        if (!user.getRole().equals(Role.HUMANRESOURCE)) {
            throw new Exception("Solo el personal de recursos humanos puede actualizar pacientes.");
        }

        
        if(userPort.findByDocument(user)!= null){
            throw new Exception("El usuario a actualizar no existe.");
        }
        
        return userPort.update(user);
    }
}
