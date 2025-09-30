package app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.infrastructure.persistence.entities.OrderProcedureEntity;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderProcedureRepository extends JpaRepository<OrderProcedureEntity, Long> {

    // Buscar procedimientos por paciente (usando el id del paciente)
    List<OrderProcedureEntity> findByPatient_Id(Long patientId);

    // Buscar procedimientos por doctor (usando el id del doctor)
    List<OrderProcedureEntity> findByDoctor_Id(Long doctorId);

    // Buscar procedimientos que requieren especialista
    List<OrderProcedureEntity> findByRequiresSpecialistTrue();

    // Buscar procedimientos por frecuencia
    List<OrderProcedureEntity> findByFrequency(String frequency);

    // Buscar procedimientos por código de especialista
    List<OrderProcedureEntity> findBySpecialistcode(int specialistcode);

    // Buscar procedimientos por rango de fechas
    List<OrderProcedureEntity> findByDateBetween(Date startDate, Date endDate);

    // Buscar procedimientos cuyo costo sea mayor a cierto valor
    List<OrderProcedureEntity> findByCostGreaterThan(double minCost);

    // Buscar procedimientos cuyo costo sea menor a cierto valor
    List<OrderProcedureEntity> findByCostLessThan(double maxCost);
}
