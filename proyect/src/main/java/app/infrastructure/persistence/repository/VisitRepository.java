package src.main.java.app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.main.java.app.infrastructure.persistence.entities.VisitEntity;
import java.util.Date;
import java.util.List;

@Repository
public interface VisitRepository extends JpaRepository<VisitEntity, Long> {

    
    List<VisitEntity> findByPatient_IdPatient(Long patientId);

  
    List<VisitEntity> findByVisitDate(Date visitDate);

   
    List<VisitEntity> findByVisitDateBetween(Date startDate, Date endDate);

    
    List<VisitEntity> findByStartTime(String startTime);
}

