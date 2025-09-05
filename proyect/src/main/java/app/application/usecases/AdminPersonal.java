
package app.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import app.domain.model.Patient;
import app.domain.model.Bill;
import app.domain.services.CreatePatient;
import app.domain.services.CreateBill;

@Service
public class AdminPersonal {
    @Autowired
    private CreatePatient createPatient;
    private CreateBill createBill;
    
    public void createPatient (Patient patient) throws Exception{
        createPatient.create(patient);
    }
    
    public void createBill (Bill bill) throws Exception{
        createBill.create(bill);
    }
   
}
