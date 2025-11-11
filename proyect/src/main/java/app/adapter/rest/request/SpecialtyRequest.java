package src.main.java.app.adapter.rest.request;

import lombok.Data;

@Data

public class SpecialtyRequest {
    private String name;

    private String description;


    private boolean activeFlag;
}
