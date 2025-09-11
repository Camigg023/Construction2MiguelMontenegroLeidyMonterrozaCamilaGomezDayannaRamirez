
package app.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Patient;
import app.domain.model.OrderProcedure;
import app.domain.model.OrderDiagnosticTest;
import app.domain.model.OrderMedication;
import app.domain.services.SearchPatient;
import app.domain.services.CreateOrder;


@Service
public class Medicals {
    @Autowired
    private SearchPatient searchPatient;
    private CreateOrder createOrderProcedure;
    private CreateOrder createOrderMedication;
    private CreateOrder createOrderDiagnosticTest;
    
    public Patient SearchByPatient (Patient patient) throws Exception{
        return searchPatient.search(patient);
    }
    
    public void CreateProcedure (OrderProcedure orderProcedure) throws Exception{
        createOrderProcedure.createProcedure(orderProcedure);
    }
    
    public void CreateOrderMedication (OrderMedication orderMedication) throws Exception{
        createOrderMedication.createOrderMedication(orderMedication);
    }
    
    public void CreateOrderDiagnosticTest (OrderDiagnosticTest orderDiagnosticTest) throws Exception{
        createOrderDiagnosticTest.createOrderDiagnosticTest(orderDiagnosticTest);
    }
}
