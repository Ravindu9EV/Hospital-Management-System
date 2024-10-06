package edu.icet.controller;

import edu.icet.dto.Patient;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class PatientController {

    private final PatientService service;

    @PostMapping("add-patient")
    public void addPatient(@RequestBody Patient patient){
        service.addPatient(patient);
    }
    @GetMapping("get-all")
    public List<Patient> getData(){
        return service.getPatient();
    }
}
