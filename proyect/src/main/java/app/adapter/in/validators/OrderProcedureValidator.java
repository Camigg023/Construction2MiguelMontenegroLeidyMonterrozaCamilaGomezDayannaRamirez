package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.sql.Date;
import app.application.exceptions.InputsException;
import src.main.java.app.domain.model.Procedure;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.model.Patient;

@Component
public class OrderProcedureValidator extends SimpleValidator {

    public long orderIdValidator(String value) throws Exception {
        long v = longValidator("número de orden", value);
        if (v <= 0 || v > 999999) {
            throw new InputsException("El número de orden debe ser mayor que 0 y máximo de 6 dígitos.");
        }
        return v;
    }

    public Procedure procedureValidator(Procedure procedure) throws Exception {
        if (procedure == null) {
            throw new InputsException("El procedimiento no puede ser nulo.");
        }
        if (procedure.getBaseCost() < 0) {
            throw new InputsException("El costo base del procedimiento no puede ser negativo.");
        }
        return procedure;
    }

    public int quantityValidator(String value) throws Exception {
        int v = integerValidator("cantidad", value);
        if (v <= 0) throw new InputsException("La cantidad debe ser mayor que 0.");
        return v;
    }

    public String frequencyValidator(String value) throws Exception {
        return stringValidator("frecuencia", value);
    }

    public Date dateValidator(String value) throws Exception {
        stringValidator("fecha", value);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date parsed = formatter.parse(value);
        return new Date(parsed.getTime());
    }

    public double unitCostValidator(String value) throws Exception {
        double v = doubleValidator("costo unitario", value);
        if (v < 0) throw new InputsException("El costo unitario no puede ser negativo.");
        return v;
    }

    public int specialistCodeValidator(String value) throws Exception {
        int v = integerValidator("código del especialista", value);
        if (v < 0) throw new InputsException("El código del especialista no puede ser negativo.");
        return v;
    }

    public User doctorValidator(User doctor) throws Exception {
        if (doctor == null) throw new InputsException("El doctor no puede ser nulo.");
        return doctor;
    }

    public Patient patientValidator(Patient patient) throws Exception {
        if (patient == null) throw new InputsException("El paciente no puede ser nulo.");
        return patient;
    }
}


