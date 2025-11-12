package src.main.java.app.domain.ports;

import src.main.java.app.domain.model.Visit;
import java.util.List;

public interface VisitPort {
    
    
    public void save(Visit visit) throws Exception;

    
    public Visit findById(int visitId) throws Exception;

    
    public Visit update(Visit visit) throws Exception;

    
    public void delete(int visitId) throws Exception;

    
    List<Visit> findByPatientId(Long patientId) throws Exception;

    
    List<Visit> findByDate(java.util.Date date) throws Exception;

    
    List<Visit> findAll() throws Exception;
}
