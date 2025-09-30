package app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.infrastructure.persistence.entities.MedicalHistoryEntity;
import app.infrastructure.persistence.entities.PatientEntity;
import java.util.Date;
import java.util.List;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistoryEntity, Long>{

    
    List<MedicalHistoryEntity> findByDoctor_Identification(Long doctorId);

   
    List<MedicalHistoryEntity> findByDiagnosisContainingIgnoreCase(String diagnosis);

   
    List<MedicalHistoryEntity> findBySymptomsContainingIgnoreCase(String symptoms);

    
    List<MedicalHistoryEntity> findByChiefComplaintContainingIgnoreCase(String chiefComplaint);

   
    List<MedicalHistoryEntity> findByDateBetween(Date startDate, Date endDate);
}
