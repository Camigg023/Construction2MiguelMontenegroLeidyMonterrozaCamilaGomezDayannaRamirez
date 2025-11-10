package src.main.java.app.adapter.in.validators;

import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

@Component
public class OrderValidator extends SimpleValidator {

    public int idValidator(String value) throws Exception {
        return (int) longValidator("ID de la orden", value);
    }

    public Date dateValidator(String value) throws Exception {
        stringValidator("fecha de la orden", value);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);

        java.util.Date parsedDate = format.parse(value);
        Date sqlDate = new Date(parsedDate.getTime());

        Date today = new Date(System.currentTimeMillis());
        if (sqlDate.after(today)) {
            throw new Exception("La fecha de la orden no puede ser futura.");
        }

        return sqlDate;
    }

    public void validateLists(
            List<?> medications,
            List<?> procedures,
            List<?> diagnosticTests
    ) throws Exception {

        boolean hasMedications = medications != null && !medications.isEmpty();
        boolean hasProcedures = procedures != null && !procedures.isEmpty();
        boolean hasDiagnostics = diagnosticTests != null && !diagnosticTests.isEmpty();

        if (hasDiagnostics && (hasMedications || hasProcedures)) {
            throw new Exception("No se pueden agregar ayudas diagnósticas si ya existen medicamentos o procedimientos en la orden.");
        }

        if ((hasMedications || hasProcedures) && hasDiagnostics) {
            throw new Exception("No se pueden agregar medicamentos o procedimientos si ya existen ayudas diagnósticas en la orden.");
        }
    }
}
