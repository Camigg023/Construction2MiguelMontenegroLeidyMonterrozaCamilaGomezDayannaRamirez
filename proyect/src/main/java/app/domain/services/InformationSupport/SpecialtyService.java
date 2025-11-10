package src.main.java.app.domain.services.InformationSupport;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.application.exceptions.BusinessException;
import src.main.java.app.domain.model.Specialty;
import src.main.java.app.domain.ports.SpecialtyPort;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyPort specialtyPort;


    public void registerSpeciality(Specialty specialty) throws BusinessException {
        if (specialty == null) {
            throw new BusinessException("La especialidad no puede ser nula.");
        }

        if (specialty.getName() == null || specialty.getName().isBlank()) {
            throw new BusinessException("El nombre de la especialidad es obligatorio.");
        }

        if (specialty.getDescription() == null || specialty.getDescription().isBlank()) {
            throw new BusinessException("Debe proporcionar una descripción para la especialidad.");
        }

        specialtyPort.save(specialty);
    }


    public List<Specialty> listAllSpecialities() {
        return specialtyPort.findAll();
    }
}
