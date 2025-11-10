package src.main.java.app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.main.java.app.infrastructure.persistence.entities.OrderMedicationEntity;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderMedicationRepository extends JpaRepository<OrderMedicationEntity, Long> {

   
    List<OrderMedicationEntity> findByPatient_Id(Long patientId);

    
    List<OrderMedicationEntity> findByDoctor_Id(Long doctorId);

    
    List<OrderMedicationEntity> findByItem(String item);

  
    List<OrderMedicationEntity> findByDosage(String dosage);

    
    List<OrderMedicationEntity> findByDuration(String duration);

    
    List<OrderMedicationEntity> findByDateBetween(Date startDate, Date endDate);

    
    List<OrderMedicationEntity> findByCostGreaterThan(double minCost);

    
    List<OrderMedicationEntity> findByCostLessThan(double maxCost);
}
