
package app.application.usecases;

import app.domain.model.User;
import app.domain.services.CreateEmployee;
import app.domain.services.UpdateEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HumanResource {
    @Autowired
    private CreateEmployee createEmployee;
    @Autowired
    private UpdateEmployee updateEmployee;
    
    public void createEmplo (User user) throws Exception {
        createEmployee.create(user);
    }
    
    public void updateEmplo (User user) throws Exception {
        updateEmployee.updateE(user);
    }
    
}
