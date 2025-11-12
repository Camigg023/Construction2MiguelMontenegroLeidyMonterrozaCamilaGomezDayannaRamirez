package src.main.java.app.adapter.rest.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class SpecialtyResponse {
    private long idSpeciality;
    private String name;
    private String description;
}
