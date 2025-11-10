package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.Date;

import src.main.java.app.domain.model.Visit;
import src.main.java.app.domain.model.Patient;
import src.main.java.app.domain.model.User;
import src.main.java.app.adapter.in.validators.VisitValidator;

@Component
public class VisitBuilder {

    @Autowired
    private VisitValidator validator;

    public Visit build(String visitIdStr, String visitDateStr, String startTime, String endTime, Patient patient, User doctor, String notes, String status)
     throws Exception {
        int visitId = validator.visitIdValidator(visitIdStr);
        Date visitDate = validator.visitDateValidator(visitDateStr);
        String validatedStartTime = validator.startTimeValidator(startTime);
        String validatedEndTime = validator.endTimeValidator(endTime);
        patient = validator.patientValidator(patient);
        doctor = validator.doctorValidator(doctor);
        String validatedNotes = validator.notesValidator(notes);
        String validatedStatus = validator.statusValidator(status);


        Visit visit = new Visit();

        visit.setVisitId(visitId);
        visit.setVisitDate(visitDate);
        visit.setStartTime(validatedStartTime);
        visit.setEndTime(validatedEndTime);
        visit.setPatient(patient);
        visit.setDoctor(doctor);
        visit.setNotes(validatedNotes);
        visit.setStatus(validatedStatus);

        return visit;
    }
}

