package edu.icet.service;

import edu.icet.dto.Patient;

import java.util.List;

public interface PatientService {
    void addPatient(Patient patient);
    List<Patient> getPatient();
}
