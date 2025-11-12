
package src.main.java.app.application.usecases;

import app.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HumanResourceUseCase {
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
