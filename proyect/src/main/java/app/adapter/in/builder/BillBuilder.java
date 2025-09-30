package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapter.in.validators.BillValidator;
import app.domain.model.Bill;
import app.domain.model.MedicalInsurance;
import app.domain.model.OrderMedication;
import app.domain.model.Patient;
import app.domain.model.User;

import java.util.Date;

@Component
public class BillBuilder {

    @Autowired
    private BillValidator billValidator;

    public Bill builder(String doctorId, String patientId, String insuranceName,
                        String medicineName, Boolean medication, String amount, String date,
                        User doctorEntity, Patient patientEntity, MedicalInsurance insuranceEntity,
                        OrderMedication medicineEntity) throws Exception {

        Bill bill = new Bill();

        // Validaciones
        long patientIdValid = billValidator.patientIdValidator(patientId);
        long doctorIdValid = billValidator.doctorIdValidator(doctorId);
        double amountValid = billValidator.amountValidator(amount);
        Date dateValid = billValidator.dateValidator(date);
        boolean medicationValid = billValidator.medicationValidator(medication);
        String medicineValid = billValidator.medicineValidator(medicineName, medicationValid);
        String insuranceValid = billValidator.medicalInsuranceValidator(insuranceName);

       
        bill.setDoctor(doctorEntity);      
        bill.setPatient(patientEntity);    
        bill.setMedicalInsurance(insuranceEntity);  
        bill.setMedicine(medicineEntity); 
        bill.setMedication(medicationValid);
        bill.setCost(amountValid);
        bill.setDate(dateValid);

        return bill;
    }
}

