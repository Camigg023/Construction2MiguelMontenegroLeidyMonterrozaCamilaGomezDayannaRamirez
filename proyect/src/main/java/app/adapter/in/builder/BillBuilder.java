package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

import src.main.java.app.adapter.in.validators.BillValidator;
import src.main.java.app.domain.model.Bill;
import src.main.java.app.domain.model.Patient;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.model.MedicalInsurance;
import src.main.java.app.domain.model.Visit;

@Component
public class BillBuilder {

    @Autowired
    private BillValidator billValidator;

    public Bill build(String doctorId, String patientId, String insuranceName, String totalCost, String date, Boolean coveredByInsurance, User doctorEntity, Patient patientEntity, MedicalInsurance insuranceEntity, Visit visitEntity)
     throws Exception {

        Bill bill = new Bill();


        Long validatedDoctorId = billValidator.doctorIdValidator(doctorId);
        Long validatedPatientId = billValidator.patientIdValidator(patientId);
        Double validatedCost = billValidator.amountValidator(totalCost);
        Date validatedDate = billValidator.dateValidator(date);
        Boolean validatedCoverage = billValidator.coveredByInsuranceValidator(coveredByInsurance);
        String validatedInsurance = billValidator.medicalInsuranceValidator(insuranceName);


        bill.setDoctor(doctorEntity);
        bill.setPatient(patientEntity);
        bill.setMedicalInsurance(insuranceEntity);
        bill.setVisit(visitEntity);
        bill.setDate(validatedDate);
        bill.setTotalCost(validatedCost);
        bill.setCoveredByInsurance(validatedCoverage);

        return bill;
    }
}

