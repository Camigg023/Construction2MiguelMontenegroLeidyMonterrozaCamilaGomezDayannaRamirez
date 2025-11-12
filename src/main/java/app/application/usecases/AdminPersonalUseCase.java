package src.main.java.app.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.main.java.app.domain.model.*;
import src.main.java.app.domain.services.AdministrativeStaff.*;

@Service
public class AdminPersonalUseCase {

    @Autowired
    private PatientService patientService;

    @Autowired
    private BillService billService;

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private MedicalInsuranceService medicalInsuranceService;

    @Autowired
    private EmergencyContactService emergencyContactService;

    public void registerPatient(Patient patient) throws Exception {
        patientService.registerPatient(patient);
    }

    public Bill generateBill(Bill bill) throws Exception {
        return billService.calculateBill(bill);
    }

    public void updatePatient(Patient patient) throws Exception {
        patientService.updatePatient(patient);
    }

    public void registerEmergencyContact(EmergencyContact contact) throws Exception {
        emergencyContactService.registerContact(contact);
    }

    public void scheduleAppointment(Appointment appointment) throws Exception {
        appointmentService.createAppointment(appointment);
    }
}
