package src.main.java.app.domain.ports;

import java.util.List;
import src.main.java.app.domain.model.Specialty;

public interface SpecialtyPort {

    Specialty save(Specialty specialty);
    List<Specialty> findAll();
}
