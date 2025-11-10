package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.java.app.adapter.in.validators.MedicalHistoryValidator;
import src.main.java.app.adapter.in.validators.UserValidator;
import src.main.java.app.adapter.in.validators.PatientValidator;
import src.main.java.app.domain.model.*;

import java.util.Date;
import java.util.List;

@Component
public class MedicalHistoryBuilder {

    @Autowired
    private MedicalHistoryValidator medicalHistoryValidator;
    @Autowired
    private UserValidator userValidator;
    @Autowired
    private PatientValidator patientValidator;

    public MedicalHistory build(String patientDocument, String doctorDocument, String chiefComplaint, String symptoms, String diagnosis, String observations, Date date, List<OrderMedication> medications, List<OrderProcedure> procedures, List<OrderDiagnosticTest> diagnostics)
     throws Exception {

        MedicalHistory history = new MedicalHistory();


        Patient patient = new Patient();
        patient.setIdPatient(patientValidator.documentValidator(patientDocument));
        history.setPatient(patient);


        User doctor = new User();
        doctor.setIdentification(userValidator.identificationValidator(doctor.getIdentification()));
        history.setDoctor(doctor);


        history.setChiefComplaint(medicalHistoryValidator.chiefComplaintValidator(chiefComplaint));
        history.setSymptoms(medicalHistoryValidator.symptomsValidator(symptoms));
        history.setDiagnosis(medicalHistoryValidator.diagnosisValidator(diagnosis));
        history.setObservations(medicalHistoryValidator.observationsValidator(observations));


        history.setDate(medicalHistoryValidator.dateValidator(date));


        history.setMedications(medicalHistoryValidator.medicationsValidator(medications));
        history.setProcedures(medicalHistoryValidator.proceduresValidator(procedures));
        history.setDiagnostics(medicalHistoryValidator.diagnosticsValidator(diagnostics));

        return history;
    }
}

