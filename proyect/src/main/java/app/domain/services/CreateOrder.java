
package app.domain.services;

import app.domain.ports.OrderPort;
import app.domain.ports.UsePort;
import app.domain.ports.PatientPort;
import app.domain.model.Order;
import app.domain.model.User;
import app.domain.model.Patient;
import app.domain.model.emuns.Role;

public class CreateOrder {
    private UsePort userPort;
    private PatientPort patientPort;
    private OrderPort orderPort;
    
    public void create (Order order) throws Exception {
        User doctor = userPort.findByDocument(order.getDoctor());
        if (doctor == null || !doctor.getRole().equals(Role.DOCTORS)){
            throw new Exception ("Las ordenes solo pueden creadas por los medicos");
        }
        
        Patient patient = patientPort.findById(order.getPatient());
        
        if (patient == null){
            throw new Exception ("La orden debe estar asociada a un paciente existente");
        }
        
        order.setDoctor(doctor);
        order.setPatient(patient);
        
        orderPort.save(order);
        
    }
}
