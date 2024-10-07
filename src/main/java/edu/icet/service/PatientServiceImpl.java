package edu.icet.service;

import edu.icet.dto.Patient;
import edu.icet.entity.PatientEntity;
import edu.icet.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{
   


    final ModelMapper mapper;
    final PatientRepository repository;
    @Override
    public void addPatient(Patient patient) {
        repository.save(mapper.map(patient, PatientEntity.class));
    }

    @Override
    public List<Patient> getPatient() {
        List<Patient> patients =new ArrayList<>();
        repository.findAll().forEach(patient -> patients.add(mapper.map(patient,Patient.class)));
        return patients;
    }
}
