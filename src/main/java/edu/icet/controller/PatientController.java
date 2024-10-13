package edu.icet.controller;

import edu.icet.dto.Patient;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class PatientController {

    private final PatientService service;

    @PostMapping("/add-patient")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPatient(@RequestBody Patient patient){
        service.addPatient(patient);
    }
    @GetMapping("/get-all")
    public List<Patient> getData(){
        return service.getPatient();
    }
    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteBytId(@PathVariable Integer id){
        service.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updatePatient(@RequestBody Patient patient){
        service.addPatient(patient);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Patient> searchPatients(@PathVariable String name){
        List<Patient> patients=new ArrayList<>();
        return service.findByName(name);
    }
    @GetMapping("/search-by-blood-group/{bloodGroup}")
    public List<Patient> searchByBloodGroup(@PathVariable String bloodGroup){
        return service.findByBloodGroup(bloodGroup);
    }

    @GetMapping("/search-by-address/{address}")
    public List<Patient> searchByAddress(@PathVariable String address){
        return service.findByAddress(address);
    }

    @GetMapping("/search-by-nic/{nic}")
    public List<Patient> searchByNic(@PathVariable String nic){
        return service.findByNic(nic);
    }

    @GetMapping("/search-by-category/{category}")
    public List<Patient> searchByCategory(@PathVariable String category){
        return service.findByCategory(category);
    }

    @GetMapping("/search-by-contact/{contact}")
    public List<Patient> searchByContact(@PathVariable String contact){
        return service.findByContact(contact);
    }
}
