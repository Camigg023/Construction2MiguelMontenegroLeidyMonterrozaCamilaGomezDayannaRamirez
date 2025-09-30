package app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.infrastructure.persistence.entities.OrderDiagnosticEntity;

import java.sql.Date;
import java.util.List;

@Repository
public interface OrderDiagnosticRepository extends JpaRepository<OrderDiagnosticEntity, Integer> {

    
    List<OrderDiagnosticEntity> findByPatient_Id(Long patientId);

   
    List<OrderDiagnosticEntity> findByDoctor_Id(Long doctorId);

    
    List<OrderDiagnosticEntity> findBySpecialistcode(int specialistCode);

    
    List<OrderDiagnosticEntity> findByRequiresSpecialistTrue();

   
    List<OrderDiagnosticEntity> findByRequiresSpecialistFalse();

    
    List<OrderDiagnosticEntity> findByItem(int item);

    
    List<OrderDiagnosticEntity> findByDateBetween(Date startDate, Date endDate);

    
    List<OrderDiagnosticEntity> findByCostGreaterThan(double minCost);

    
    List<OrderDiagnosticEntity> findByCostLessThan(double maxCost);
}
