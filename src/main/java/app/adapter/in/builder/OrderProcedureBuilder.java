package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.Date;

import src.main.java.app.domain.model.*;
import src.main.java.app.adapter.in.validators.OrderProcedureValidator;

@Component
public class OrderProcedureBuilder {

    @Autowired
    private OrderProcedureValidator validator;

    public OrderProcedure build(String orderIdStr, Procedure procedure, String quantityStr, String frequency, User doctor, Patient patient, String dateStr, String unitCostStr, String specialistCodeStr)

     throws Exception {

        long orderId = validator.orderIdValidator(orderIdStr);
        Procedure validatedProcedure = validator.procedureValidator(procedure);
        int quantity = validator.quantityValidator(quantityStr);
        String validatedFrequency = validator.frequencyValidator(frequency);
        User validatedDoctor = validator.doctorValidator(doctor);
        Patient validatedPatient = validator.patientValidator(patient);
        Date validatedDate = validator.dateValidator(dateStr);
        double validatedUnitCost = validator.unitCostValidator(unitCostStr);
        int validatedSpecialistCode = validator.specialistCodeValidator(specialistCodeStr);


        OrderProcedure orderProcedure = new OrderProcedure(
                orderId,
                validatedProcedure,
                quantity,
                validatedFrequency,
                validatedDoctor,
                validatedPatient,
                validatedDate,
                validatedUnitCost,
                validatedSpecialistCode
        );

        return orderProcedure;
    }
}




