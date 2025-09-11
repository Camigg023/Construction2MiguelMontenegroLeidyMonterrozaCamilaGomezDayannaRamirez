package app.domain.services;

import app.domain.ports.PatientPort;
import app.domain.model.OrderProcedure;
import app.domain.model.OrderMedication;
import app.domain.model.OrderDiagnosticTest;
import app.domain.model.User;
import app.domain.model.Patient;
import app.domain.model.emuns.Role;
import app.domain.ports.OrderProcedurePort;
import app.domain.ports.OrderMedicationPort;
import app.domain.ports.OrderDiagnosticTestPort;
import app.domain.ports.UserPort;

public class CreateOrder {
    private UserPort userPort;
    private PatientPort patientPort;
    private OrderProcedurePort orderProcedurePort;
    private OrderMedicationPort orderMedicationPort;
    private OrderDiagnosticTestPort orderDiagnosticTestPort;
    
    public void createProcedure (OrderProcedure orderProcedure) throws Exception {
        User doctor = userPort.findByDocument(orderProcedure.getDoctor());
        if (doctor == null || !doctor.getRole().equals(Role.DOCTORS)){
            throw new Exception ("Las ordenes solo pueden creadas por los medicos");
        }
        
        Patient patient = patientPort.findById(orderProcedure.getPatient());
        
        if (patient == null){
            throw new Exception ("La orden debe estar asociada a un paciente existente");
        }
        
        orderProcedure.setDoctor(doctor);
        orderProcedure.setPatient(patient);
        
        orderProcedurePort.save(orderProcedure);
        
    }
    
    public void createOrderMedication (OrderMedication orderMedication) throws Exception {
        User doctor = userPort.findByDocument(orderMedication.getDoctor());
        if (doctor == null || !doctor.getRole().equals(Role.DOCTORS)){
            throw new Exception ("Las ordenes solo pueden creadas por los medicos");
        }
        
        Patient patient = patientPort.findById(orderMedication.getPatient());
        
        if (patient == null){
            throw new Exception ("La orden debe estar asociada a un paciente existente");
        }
        
        orderMedication.setDoctor(doctor);
        orderMedication.setPatient(patient);
        
        orderMedicationPort.save(orderMedication);     
    }
    
    public void createOrderDiagnosticTest (OrderDiagnosticTest orderDiagnosticTest) throws Exception {
        User doctor = userPort.findByDocument(orderDiagnosticTest.getDoctor());
        if (doctor == null || !doctor.getRole().equals(Role.DOCTORS)){
            throw new Exception ("Las ordenes solo pueden creadas por los medicos");
        }
        
        Patient patient = patientPort.findById(orderDiagnosticTest.getPatient());
        
        if (patient == null){
            throw new Exception ("La orden debe estar asociada a un paciente existente");
        }
        
        orderDiagnosticTest.setDoctor(doctor);
        orderDiagnosticTest.setPatient(patient);
        
        orderDiagnosticTestPort.save(orderDiagnosticTest);        
    }
}
