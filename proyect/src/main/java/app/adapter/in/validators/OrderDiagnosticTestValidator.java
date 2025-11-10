package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.sql.Date;
import src.main.java.app.domain.model.User;
import src.main.java.app.domain.model.Patient;
import src.main.java.app.domain.model.DiagnosticTest;
import app.application.exceptions.InputsException;

@Component
public class OrderDiagnosticTestValidator extends SimpleValidator {

    public int orderNumberValidator(String value) throws Exception {
        int number = integerValidator("número de orden", value);
        if (String.valueOf(number).length() > 6) {
            throw new InputsException("El número de orden no puede tener más de 6 dígitos");
        }
        return number;
    }

    public int itemValidator(String value) throws Exception {
        return integerValidator("ítem del diagnóstico", value);
    }

    public int quantityValidator(String value) throws Exception {
        int qty = integerValidator("cantidad del examen", value);
        if (qty <= 0) {
            throw new InputsException("La cantidad del examen debe ser mayor que 0");
        }
        return qty;
    }

    public Boolean requiresSpecialistValidator(String value) throws Exception {
        stringValidator("requiere especialista", value);
        if (!value.equalsIgnoreCase("true") && !value.equalsIgnoreCase("false")) {
            throw new InputsException("El campo 'requiere especialista' debe ser true o false");
        }
        return Boolean.parseBoolean(value);
    }

    public Integer specialistCodeValidator(String value, Boolean requiresSpecialist) throws Exception {
        if (requiresSpecialist) {
            return integerValidator("código de especialista", value);
        }
        return null;
    }

    public User doctorValidator(User doctor) throws Exception {
        if (doctor == null) {
            throw new InputsException("El doctor no puede ser nulo");
        }
        return doctor;
    }

    public Patient patientValidator(Patient patient) throws Exception {
        if (patient == null) {
            throw new InputsException("El paciente no puede ser nulo");
        }
        return patient;
    }

    public DiagnosticTest diagnosticTestValidator(DiagnosticTest diagnosticTest) throws Exception {
        if (diagnosticTest == null) {
            throw new InputsException("El examen diagnóstico asociado no puede ser nulo");
        }
        return diagnosticTest;
    }

    public java.util.Date dateValidator(String value) throws Exception {
        stringValidator("fecha", value);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return formatter.parse(value);
        } catch (Exception e) {
            throw new InputsException("La fecha debe tener formato yyyy-MM-dd");
        }
    }

    public double costValidator(String value) throws Exception {
        double cost = doubleValidator("costo total", value);
        if (cost < 0) {
            throw new InputsException("El costo no puede ser negativo");
        }
        return cost;
    }

    public double copayValidator(String value) throws Exception {
        double copay = doubleValidator("copago", value);
        if (copay < 0) {
            throw new InputsException("El copago no puede ser negativo");
        }
        return copay;
    }

    public double insuranceCoveredValidator(String value) throws Exception {
        double insured = doubleValidator("monto cubierto por aseguradora", value);
        if (insured < 0) {
            throw new InputsException("El monto cubierto no puede ser negativo");
        }
        return insured;
    }

    public String statusValidator(String value) throws Exception {
        stringValidator("estado", value);
        if (!value.equalsIgnoreCase("Pending")
                && !value.equalsIgnoreCase("Completed")
                && !value.equalsIgnoreCase("Cancelled")) {
            throw new InputsException("El estado debe ser 'Pending', 'Completed' o 'Cancelled'");
        }
        return value;
    }

    public String resultNotesValidator(String value) {
        return value == null ? "" : value.trim();
    }
}
