
package app.domain.services;

import app.domain.model.User;
import app.domain.ports.UserPort;


public class CreateUser {
    private UserPort userPort;
    
    public void create (User user) throws Exception{
        if (userPort.findByDocument(user) != null){
            throw new Exception("Ya existe esa cedula en el sistema");
        }
        
        if (userPort.findByUserName(user) != null){
            throw new Exception ("Ya existe ese nombre de usuario en el sistema");
        }
    }
}
