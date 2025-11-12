package src.main.java.app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.main.java.app.infrastructure.persistence.entities.PatientEntity;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

    
    PatientEntity findByEmail(String email);

    
    PatientEntity findByTelephoneNumber(long telephoneNumber);

    
    PatientEntity findByFullName(String fullName);
}

