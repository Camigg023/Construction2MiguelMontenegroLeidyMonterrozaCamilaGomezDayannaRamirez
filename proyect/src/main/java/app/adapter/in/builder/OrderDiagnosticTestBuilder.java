package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.domain.model.OrderDiagnosticTest;
import app.domain.model.Patient;
import app.adapter.in.validators.OrderDiagnosticTestValidator;

import java.util.Date;

@Component
public class OrderDiagnosticTestBuilder {

    @Autowired
    private OrderDiagnosticTestValidator validator;

    public OrderDiagnosticTest build(
            Patient patient,
            String dateStr,
            String costStr,
            String quantityStr,
            String requiresSpecialistStr,
            String specialistCodeStr,
            String itemStr
    ) throws Exception {

        
        patient = validator.patientValidator(patient);

        
        Date utilDate = validator.dateValidator(dateStr);        
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); 

        double cost = validator.costValidator(costStr);

        
        int quantity = validator.quantityValidator(quantityStr);
        Boolean requiresSpecialist = validator.requiresSpecialistValidator(requiresSpecialistStr);
        int specialistCode = validator.specialistCodeValidator(specialistCodeStr);
        int item = validator.itemValidator(itemStr);

       
        OrderDiagnosticTest order = new OrderDiagnosticTest();
        order.setPatient(patient);
        order.setDate(sqlDate);          
        order.setCost(cost);
        order.setQuantity(quantity);
        order.setRequiresSpecialist(requiresSpecialist);
        order.setSpecialistcode(specialistCode);
        order.setItem(item);

        return order;
    }
}
