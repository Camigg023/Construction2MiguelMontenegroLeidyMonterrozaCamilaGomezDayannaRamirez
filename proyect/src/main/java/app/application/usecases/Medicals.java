
package app.application.usecases;

import app.domain.model.MedicalHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Patient;
import app.domain.model.OrderProcedure;
import app.domain.model.OrderDiagnosticTest;
import app.domain.model.OrderMedication;
import app.domain.model.User;
import app.domain.services.CreateMedicalHistory;
import app.domain.services.SearchPatient;
import app.domain.services.CreateOrder;
import app.domain.services.SearchMedicalHistory;
import app.domain.services.UpdateMedicalHistory;


@Service
public class Medicals {
    @Autowired
    private SearchPatient searchPatient;
    private CreateOrder createOrder;
    private SearchMedicalHistory searchMedicalHistory;
    private CreateMedicalHistory createMedicalHistory;
    private UpdateMedicalHistory updateMedicalHistory;
    private User doctor;
    
    
    public Patient SearchByPatient (Patient patient) throws Exception{
        return searchPatient.search(patient);
    }
    
    public void CreateProcedure (OrderProcedure orderProcedure) throws Exception{
        createOrder.createProcedure(orderProcedure);
    }
    
    public void CreateOrderMedication (OrderMedication orderMedication) throws Exception{
        createOrder.createOrderMedication(orderMedication);
    }
    
    public void CreateOrderDiagnosticTest (OrderDiagnosticTest orderDiagnosticTest) throws Exception{
        createOrder.createOrderDiagnosticTest(orderDiagnosticTest);
    }
    
    public void createHistory(MedicalHistory medicalHistory) throws Exception{
        createMedicalHistory.create(medicalHistory, doctor);
    }
    
    public void searchHistory(MedicalHistory medicalHistory) throws Exception{
        searchMedicalHistory.searchByPatient(doctor, Long.MAX_VALUE);
    }
    
    public void updateHistory(MedicalHistory medicalHistory) throws Exception{
        updateMedicalHistory.update(doctor, Long.MIN_VALUE, medicalHistory);
    }
}
