
package app.application.usecases;

import app.domain.model.OrderDiagnosticTest;
import app.domain.model.OrderMedication;
import app.domain.model.OrderProcedure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.Visit;


@Service
public class NursesUseCase {
    
    @Autowired
    private SearchPatient searchPatient;
    @Autowired
    private SearchOrder searchOrder;
    @Autowired 
    private User employee;
    @Autowired
    private RegisterVisit registerVisit;
    
    public Patient SearchByPatient (Patient patient) throws Exception{
        return searchPatient.search(patient);
    }
    
    public void searchProcedure (OrderProcedure orderProcedure) throws Exception{
        searchOrder.searchProcedures(employee, Long.MAX_VALUE);
    }
    
    public void searchDiagnostic (OrderDiagnosticTest orderDiagnosticTest) throws Exception{
        searchOrder.searchDiagnostics(employee, Long.MAX_VALUE);
    }
    
    public void searchOrderMedication (OrderMedication orderMedication) throws Exception{
        searchOrder.searchMedications(employee, Long.MAX_VALUE);
    }
    
    public void registerVisitPatient (Visit visit) throws Exception {
        registerVisit.register(employee, visit);
    }
}
