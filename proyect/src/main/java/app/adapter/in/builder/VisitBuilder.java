package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.Date;

import app.domain.model.Visit;
import app.domain.model.Patient;
import app.adapter.in.validators.VisitValidator;

@Component
public class VisitBuilder {

    @Autowired
    private VisitValidator validator;

    public Visit build(
            Patient patient,
            String visitIdStr,
            String visitDateStr,
            String startTime,
            String endTime,
            String notes
    ) throws Exception {

        // Validaciones
        patient = validator.patientValidator(patient);
        int visitId = validator.visitIdValidator(visitIdStr);
        Date visitDate = validator.visitDateValidator(visitDateStr);
        String validatedStartTime = validator.startTimeValidator(startTime);
        String validatedEndTime = validator.endTimeValidator(endTime);
        String validatedNotes = validator.notesValidator(notes);

        // Construcción de la visita
        Visit visit = new Visit();
        visit.setVisitId(visitId);
        visit.setPatient(patient);
        visit.setVisitDate(visitDate);
        visit.setStartTime(validatedStartTime);
        visit.setEndTime(validatedEndTime);
        visit.setNotes(validatedNotes);

        return visit;
    }
}
