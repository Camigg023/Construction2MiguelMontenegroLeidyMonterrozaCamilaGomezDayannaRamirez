package app.infrastructure.persistence.mapper;

import app.domain.model.Visit;
import app.domain.model.Patient;
import app.infrastructure.persistence.entities.VisitEntity;

public class VisitMapper {

    public static VisitEntity toEntity(Visit visit) {
        if (visit == null) return null;

        VisitEntity entity = new VisitEntity();

       
        entity.setVisitId(visit.getVisitId() != 0 ? Long.valueOf(visit.getVisitId()) : null);

        entity.setVisitDate(visit.getVisitDate());
        entity.setStartTime(visit.getStartTime());
        entity.setEndTime(visit.getEndTime());

       
        entity.setPatient(visit.getPatient());

        entity.setNotes(visit.getNotes());

        return entity;
    }

    public static Visit toDomain(VisitEntity entity) {
        if (entity == null) return null;

        Visit visit = new Visit();

       
        visit.setVisitId(entity.getVisitId() != null ? entity.getVisitId().intValue() : 0);

        visit.setVisitDate(entity.getVisitDate());
        visit.setStartTime(entity.getStartTime());
        visit.setEndTime(entity.getEndTime());

        
        visit.setPatient(entity.getPatient());

        visit.setNotes(entity.getNotes());

        return visit;
    }
}

