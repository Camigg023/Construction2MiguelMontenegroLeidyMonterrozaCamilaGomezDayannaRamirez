
package app.domain.services;

import app.domain.ports.UsePort;
import app.domain.ports.PatientPort;
import app.domain.model.OrderProcedure;
import app.domain.model.User;
import app.domain.model.Patient;
import app.domain.model.emuns.Role;
import app.domain.ports.OrderProcedurePort;

public class CreateOrderProcedure {
    private UsePort userPort;
    private PatientPort patientPort;
    private OrderProcedurePort orderPort;
    
    public void create (OrderProcedure orderProcedure) throws Exception {
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
        
        orderPort.save(orderProcedure);
        
    }
}
