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

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public boolean updateById(Integer id) {
        return false;
    }

    public List<Patient> findByName(String name){
        List<Patient> patients=new ArrayList<>();
        repository.findByName(name).forEach(entity->{
            patients.add(mapper.map(entity,Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> findByBloodGroup(String bloodGroup) {
        List<Patient> patients=new ArrayList<>();
        repository.findByBloodGroup(bloodGroup).forEach(entity->{
            patients.add(mapper.map(entity,Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> findByAddress(String address) {
        List<Patient> patients=new ArrayList<>();
        repository.findByAddress(address).forEach(patientEntity -> {
            patients.add(mapper.map(patientEntity,Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> findByNic(String nic) {
        List<Patient> patients=new ArrayList<>();
        repository.findByNic(nic).forEach(patientEntity -> {
            patients.add(mapper.map(patientEntity,Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> findByCategory(String category) {
        List<Patient> patients=new ArrayList<>();
        repository.findByCategory(category).forEach(patientEntity -> {
          patients.add(mapper.map(patientEntity,Patient.class));
        });
        return patients;
    }

    @Override
    public List<Patient> findByContact(String contact) {
        List<Patient> patients=new ArrayList<>();
        repository.findByContact(contact).forEach(patientEntity -> {
            patients.add(mapper.map(patientEntity,Patient.class));
        });
        return patients;
    }
}
