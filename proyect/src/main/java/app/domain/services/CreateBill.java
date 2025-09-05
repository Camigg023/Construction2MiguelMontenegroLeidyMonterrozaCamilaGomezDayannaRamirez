package app.domain.services;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.Bill;
import app.domain.model.MedicalInsurance;
import app.domain.model.OrderMedication;
import app.domain.model.emuns.Role;
import app.domain.ports.PatientPort;
import app.domain.ports.MedicalInsurancePort;
import app.domain.ports.OrderMedicationPort;
import app.domain.ports.BillPort;
import app.domain.ports.UsePort;
        
public class CreateBill {
    
    private PatientPort patientPort;
    private OrderMedicationPort medicationPort;
    private UsePort userPort;
    private MedicalInsurancePort insurancePort;
    private BillPort billPort;
    private User user;
    
    public void create (Bill bill) throws Exception{
        if (!user.getRole().equals(Role.ADMINISTRATIVESTAFF)){
            throw new Exception ("Solo el personal administrativo puede crear facturas");
        }
        Patient patient = patientPort.findById(bill.getPatient());
        if (patient ==null) {
            throw new Exception("La factura debe estar asociada a un paciente");
        }
        User doctor = userPort.findByDocument(bill.getDoctor());
        if (doctor == null) {
            throw new Exception("La factura debe tener un medico asociado");
        }
        MedicalInsurance medicalInsurance = insurancePort.findByPolicyNumber(bill.getMedicalInsurance());
        if (medicalInsurance == null) {
            throw new Exception("La factura debe tener un seguro médico asociado");
        }
        
        if (bill.isMedication()){
            OrderMedication medication = medicationPort.FindbyMedicationId(bill.getMedicine());
            if(medication != null){
                throw new Exception ("La factura requiere un medicamento valido");
            }
            bill.setMedicine(medication);
        }
        
        bill.setDoctor(doctor);
        bill.setPatient(patient);
        bill.getMedicalInsurance();
        
        billPort.save(bill);
        
    }
    
}
