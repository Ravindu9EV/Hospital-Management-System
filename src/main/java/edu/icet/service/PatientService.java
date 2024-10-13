package edu.icet.service;

import edu.icet.dto.Patient;
import edu.icet.entity.PatientEntity;

import java.util.List;

public interface PatientService {
    void addPatient(Patient patient);
    List<Patient> getPatient();
    void deleteById(Integer id);
    boolean updateById(Integer id);

    List<Patient> findByName(String name);

    List<Patient> findByBloodGroup(String bloodGroup);

    List<Patient> findByAddress(String address);

    List<Patient> findByNic(String nic);

    List<Patient> findByCategory(String category);

    List<Patient> findByContact(String contact);
}
