package src.main.java.app.adapter.rest.mapper;

import app.domain.model.Visit;
import app.adapter.in.rest.request.VisitRequest;
import app.adapter.in.rest.response.VisitResponse;

public class VisitMapper {
    public static Visit toVisit(VisitRequest request) {
        Visit visit = new Visit();
        visit.setVisitDate(request.getVisitDate());
        visit.setStartTime(request.getStartTime());
        visit.setEndTime(request.getEndTime());
        visit.setPatient(request.getPatient());
        visit.setDoctor(request.getDoctor());
        visit.setVitalSigns(request.getVitalSigns());
        visit.setMedications(request.getMedications());
        visit.setProcedures(request.getProcedures());
        visit.setDiagnosticTests(request.getDiagnosticTests());
        visit.setNotes(request.getNotes());
        visit.setStatus(request.getStatus());
        visit.calculateTotalCost();
        return visit;
    }

    public static VisitResponse toVisitResponse(Visit visit) {
        VisitResponse response = new VisitResponse();
        response.setVisitId(visit.getVisitId());
        response.setVisitDate(visit.getVisitDate());
        response.setStartTime(visit.getStartTime());
        response.setEndTime(visit.getEndTime());
        response.setPatient(visit.getPatient());
        response.setDoctor(visit.getDoctor());
        response.setVitalSigns(visit.getVitalSigns());
        response.setMedications(visit.getMedications());
        response.setProcedures(visit.getProcedures());
        response.setDiagnosticTests(visit.getDiagnosticTests());
        response.setNotes(visit.getNotes());
        response.setStatus(visit.getStatus());
        response.setTotalCost(visit.getTotalCost());
        return response;
    }
}
