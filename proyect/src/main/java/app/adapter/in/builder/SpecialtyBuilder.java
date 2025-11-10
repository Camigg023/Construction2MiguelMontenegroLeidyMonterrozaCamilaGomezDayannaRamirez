package src.main.java.app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.main.java.app.domain.model.Specialty;
import src.main.java.app.adapter.in.validators.SpecialtyValidator;

@Component
public class SpecialtyBuilder {

    @Autowired
    private SpecialtyValidator validator;

    public Specialty build(String idStr, String nameStr, String descriptionStr)
      throws Exception {

        long id = validator.idValidator(idStr);
        String name = validator.nameValidator(nameStr);
        String description = validator.descriptionValidator(descriptionStr);

        Specialty specialty = new Specialty(id, name, description);

        return specialty;
    }
}

