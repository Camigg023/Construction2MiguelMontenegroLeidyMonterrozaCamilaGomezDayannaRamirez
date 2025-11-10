package src.main.java.app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.main.java.app.infrastructure.persistence.entities.BillEntity;
import java.util.Date;
import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<BillEntity, Long> {

   
    List<BillEntity> findByPatient_IdPatient(Long patientId);

   
    List<BillEntity> findByDoctor_Identification(Long doctorId);

    
    List<BillEntity> findByMedicalInsurance_Id(Long insuranceId);

    
    List<BillEntity> findByMedicationTrue();

    
    List<BillEntity> findByMedicationFalse();

    
    List<BillEntity> findByDateBetween(Date startDate, Date endDate);
}
