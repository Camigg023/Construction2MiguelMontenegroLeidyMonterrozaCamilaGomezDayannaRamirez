package app.domain.services;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.Bill;
import app.domain.model.MedicalInsurance;
import app.domain.model.Medication;
import app.domain.ports.PatientPort;
import app.domain.ports.MedicalInsurancePort;
import app.domain.ports.MedicationPort;
import app.domain.ports.BillPort;
import app.domain.ports.UsePort;
        
public class CreateBill {
    
    private PatientPort patientPort;
    private MedicationPort medicationPort;
    private UsePort userPort;
    private MedicalInsurancePort insurancePort;
    private BillPort billPort;
    
    public void create (Bill bill) throws Exception{
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
            Medication medication = medicationPort.findByMedicationId(bill.getMedicine());
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
