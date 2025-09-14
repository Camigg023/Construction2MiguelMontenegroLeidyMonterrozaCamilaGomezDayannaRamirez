
package app.application.usecases;

import app.domain.model.OrderDiagnosticTest;
import app.domain.model.OrderMedication;
import app.domain.model.OrderProcedure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.services.SearchOrder;
import app.domain.services.SearchPatient;


@Service
public class Nurses {
    
    @Autowired
    private SearchPatient searchPatient;
    @Autowired
    private SearchOrder searchOrder;
    @Autowired 
    private User doctor;
    
    public Patient SearchByPatient (Patient patient) throws Exception{
        return searchPatient.search(patient);
    }
    
    public void searchProcedure (OrderProcedure orderProcedure) throws Exception{
        searchOrder.searchProcedures(doctor, Long.MAX_VALUE);
    }
    
    public void searchDiagnostic (OrderDiagnosticTest orderDiagnosticTest) throws Exception{
        searchOrder.searchDiagnostics(doctor, Long.MAX_VALUE);
    }
    
    public void searchOrderMedication (OrderMedication orderMedication) throws Exception{
        searchOrder.searchMedications(doctor, Long.MAX_VALUE);
    }
}
