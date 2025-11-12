package src.main.java.app.adapter.rest.mapper;

import app.adapter.in.rest.request.MedicalHistoryRequest;
import app.adapter.in.rest.response.MedicalHistoryResponse;
import app.domain.model.MedicalHistory;
import lombok.experimental.UtilityClass;

@UtilityClass

public class MedicalHistoryMapper {
    public MedicalHistory toDomain(MedicalHistoryRequest request) {
        MedicalHistory history = new MedicalHistory();
        history.setPatient(request.getPatient());
        history.setChiefComplaint(request.getChiefComplaint());
        history.setSymptoms(request.getSymptoms());
        history.setDiagnosis(request.getDiagnosis());
        history.setDoctor(request.getDoctor());
        history.setDate(request.getDate());
        history.setMedications(request.getMedications());
        history.setProcedures(request.getProcedures());
        history.setDiagnostics(request.getDiagnostics());
        history.setObservations(request.getObservations());
        return history;
    }

    public MedicalHistoryResponse toResponse(MedicalHistory history) {
        return MedicalHistoryResponse.builder()
                .id(history.getId())
                .patient(history.getPatient())
                .chiefComplaint(history.getChiefComplaint())
                .symptoms(history.getSymptoms())
                .diagnosis(history.getDiagnosis())
                .doctor(history.getDoctor())
                .date(history.getDate())
                .medications(history.getMedications())
                .procedures(history.getProcedures())
                .diagnostics(history.getDiagnostics())
                .observations(history.getObservations())
                .build();
    }
}