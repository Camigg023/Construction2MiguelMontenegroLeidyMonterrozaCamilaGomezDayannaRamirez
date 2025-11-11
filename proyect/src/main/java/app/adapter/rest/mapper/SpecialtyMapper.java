package src.main.java.app.adapter.rest.mapper;

import app.adapter.in.rest.request.SpecialtyRequest;
import app.adapter.in.rest.response.SpecialtyResponse;
import app.domain.model.Specialty;
import lombok.experimental.UtilityClass;

@UtilityClass

public class SpecialtyMapper {
    public Specialty toDomain(SpecialtyRequest request) {
        Specialty specialty = new Specialty();
        specialty.setName(request.getName());
        specialty.setDescription(request.getDescription());
        return specialty;
    }

    public SpecialtyResponse toResponse(Specialty specialty) {
        return SpecialtyResponse.builder()
                .idSpeciality(specialty.getIdSpeciality())
                .name(specialty.getName())
                .description(specialty.getDescription())
                .build();
    }
}
