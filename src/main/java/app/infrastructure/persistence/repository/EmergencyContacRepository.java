package src.main.java.app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.main.java.app.infrastructure.persistence.entities.EmergencyContactEntity;
import java.util.List;

@Repository
public interface EmergencyContacRepository extends JpaRepository<EmergencyContactEntity, Integer> {

    
    List<EmergencyContactEntity> findByName(String name);

    
    List<EmergencyContactEntity> findByRelationShip(String relationShip);

    
    EmergencyContactEntity findByPhone(int phone);
}
