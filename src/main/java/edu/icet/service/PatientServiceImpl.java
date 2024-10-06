package edu.icet.service;

import edu.icet.dto.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{
    List<Patient> patientList=new ArrayList<>();
    final ModelMapper mapper;
    @Override
    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    @Override
    public List<Patient> getPatient() {
        return patientList;
    }
}
