package app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.infrastructure.persistence.entities.AppointmentEntity;
import java.util.Date;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Long> {

    
    List<AppointmentEntity> findByPatient_IdPatient(Long patientId);

    
    List<AppointmentEntity> findByDoctor_Identification(Long doctorId);

    
    List<AppointmentEntity> findByDate(Date date);

    
    List<AppointmentEntity> findByDateBetween(Date startDate, Date endDate);

    
    List<AppointmentEntity> findByStatus(String status);
}

