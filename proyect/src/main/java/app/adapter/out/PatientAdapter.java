/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.out;



import app.domain.model.Patient;
import app.domain.ports.PatientPort;
import app.infrastructure.persistence.entities.PatientEntity;
import app.infrastructure.persistence.mapper.PatientMapper;
import app.infrastructure.persistence.repository.PatientRepository;

public class PatientAdapter implements PatientPort {

    private PatientRepository patientRepository;
    
    @Override
    public Patient findById(Patient patient) throws Exception {
        PatientEntity entity = patientRepository.findById(patient.getIdPatient())
                .orElseThrow(() -> new Exception("Paciente con id " + patient + " no encontrado"));
        return PatientMapper.toDomain(entity);
    }

    @Override
    public void save(Patient patient) throws Exception {
        PatientEntity savedEntity = patientRepository.save(PatientMapper.toEntity(patient));
    }

    @Override
    public Patient update(Patient patient) throws Exception {
        PatientEntity savedEntity = patientRepository.save(PatientMapper.toEntity(patient));
        return PatientMapper.toDomain(savedEntity);
    }


    
}

