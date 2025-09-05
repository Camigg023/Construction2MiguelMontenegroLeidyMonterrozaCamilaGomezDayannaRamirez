
package app.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Patient;
import app.domain.model.OrderProcedure;
import app.domain.services.SearchPatient;
import app.domain.services.CreateOrderProcedure;


@Service
public class Medicals {
    @Autowired
    private SearchPatient searchPatient;
    private CreateOrderProcedure createOrderProcedure;
    
    public Patient SearchByPatient (Patient patient) throws Exception{
        return searchPatient.search(patient);
    }
    
    public void CreateProcedure (OrderProcedure orderProcedure) throws Exception{
        createOrderProcedure.create(orderProcedure);
    }
    
}
