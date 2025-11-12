package src.main.java.app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.main.java.app.infrastructure.persistence.entities.MedicalInsuranceEntity;
import java.sql.Date;
import java.util.List;

@Repository
public interface MedicalInsuranceRepository extends JpaRepository<MedicalInsuranceEntity, String> {

   
    List<MedicalInsuranceEntity> findByCompany(String company);

    
    List<MedicalInsuranceEntity> findByStatus(Boolean status);

   
    List<MedicalInsuranceEntity> findByValidityBefore(Date date);

    
    List<MedicalInsuranceEntity> findByValidityAfter(Date date);
}
