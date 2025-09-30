package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.domain.model.OrderMedication;
import app.domain.model.Patient;
import app.domain.model.User;
import app.adapter.in.validators.OrderMedicationValidator;

import java.sql.Date; 

@Component
public class OrderMedicationBuilder {

    @Autowired
    private OrderMedicationValidator validator;

    public OrderMedication build(
            User doctor,
            Patient patient,
            String dateStr,
            String costStr,
            String dosage,
            String duration,
            String itemStr
    ) throws Exception {

        
        doctor = validator.doctorValidator(doctor);
        patient = validator.patientValidator(patient);

        
        Date date = validator.dateValidator(dateStr); 
        double cost = validator.costValidator(costStr);

        
        String validatedDosage = validator.dosageValidator(dosage);
        String validatedDuration = validator.durationValidator(duration);
        int item = validator.itemValidator(itemStr);

        
        OrderMedication order = new OrderMedication();
        order.setDoctor(doctor);       
        order.setPatient(patient);
        order.setDate(date);           
        order.setCost(cost);
        order.setDosage(validatedDosage);
        order.setDuration(validatedDuration);
        order.setItem(item);

        return order;
    }
}
