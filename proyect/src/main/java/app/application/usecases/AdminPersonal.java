
package app.application.usecases;

import app.domain.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import app.domain.model.Patient;
import app.domain.model.Bill;
import app.domain.model.EmergencyContact;
import app.domain.services.CreateAppointment;
import app.domain.services.CreatePatient;
import app.domain.services.CreateBill;
import app.domain.services.CreateEmergencyContact;
import app.domain.services.UpdatePatient;

@Service
public class AdminPersonal {
    @Autowired
    private CreatePatient createPatient;
    private CreateBill createBill;
    private UpdatePatient updatePatient;
    private CreateEmergencyContact createEmergencyContact;
    private CreateAppointment createAppointment;
    
    public void createPatient (Patient patient) throws Exception{
        createPatient.create(patient);
    }
    
    public void createBill (Bill bill) throws Exception{
        createBill.create(bill);
    }
    
    public void updatePat (Patient patient) throws Exception{
        updatePatient.updateP(patient);
    }
    
    public void createContact(EmergencyContact emergencyContact) throws Exception{
        createEmergencyContact.create(emergencyContact);
    }
    
    public void createAppoint (Appointment appointment) throws Exception {
        createAppointment.create(appointment);
    }
   
}
