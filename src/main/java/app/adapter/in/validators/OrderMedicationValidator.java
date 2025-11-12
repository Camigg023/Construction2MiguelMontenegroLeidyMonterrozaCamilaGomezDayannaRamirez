package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import app.application.exceptions.InputsException;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.model.Patient;
import src.main.java.app.domain.model.Medication;


@Component
public class OrderMedicationValidator extends SimpleValidator {

    public int orderIdValidator(String value) throws Exception {
        int v = integerValidator("número de orden", value);
        if (v <= 0 || v > 999999) {
            throw new InputsException("El número de orden debe ser mayor que 0 y máximo 6 dígitos.");
        }
        return v;
    }

    public int itemValidator(String value) throws Exception {
        int v = integerValidator("ítem de la orden", value);
        if (v <= 0) {
            throw new InputsException("El ítem debe ser mayor que 0.");
        }
        return v;
    }

    public int quantityValidator(String value) throws Exception {
        int v = integerValidator("cantidad", value);
        if (v <= 0) {
            throw new InputsException("La cantidad debe ser mayor que 0.");
        }
        return v;
    }

    public String doseValidator(String value) throws Exception {
        return stringValidator("dosis", value);
    }

    public String durationValidator(String value) throws Exception {
        return stringValidator("duración", value);
    }

    public Date dateValidator(String value) throws Exception {
        stringValidator("fecha", value);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        formatter.setLenient(false);
        java.util.Date parsed = formatter.parse(value);
        return parsed;
    }

    public Medication medicationValidator(Medication medication) throws Exception {
        if (medication == null) {
            throw new InputsException("El medicamento no puede ser nulo.");
        }
        if (medication.getUnitCost() < 0) {
            throw new InputsException("El costo unitario del medicamento no puede ser negativo.");
        }
        return medication;
    }

    public User doctorValidator(User doctor) throws Exception {
        if (doctor == null) {
            throw new InputsException("El médico no puede ser nulo.");
        }
        return doctor;
    }

    public Patient patientValidator(Patient patient) throws Exception {
        if (patient == null) {
            throw new InputsException("El paciente no puede ser nulo.");
        }
        return patient;
    }

    public void validateCopayInsuranceConsistency(double cost, double copay, double insuranceCovered) throws Exception {
        if (cost < 0) {
            throw new InputsException("El costo no puede ser negativo.");
        }
        if (copay < 0 || insuranceCovered < 0) {
            throw new InputsException("Copago y cobertura no pueden ser negativos.");
        }
        if ((copay + insuranceCovered) > cost) {
            throw new InputsException("El copago y la cobertura no pueden superar el costo total.");
        }
    }
}
