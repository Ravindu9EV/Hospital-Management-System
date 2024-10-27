package edu.icet.controller;

import edu.icet.dto.Appoinment;
import edu.icet.service.AppoinmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appoinmet")
@RequiredArgsConstructor
public class AppoinmentController {
    final AppoinmentService service;

    @PostMapping("/add-appoinment")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAppoinment(@RequestBody Appoinment appoinment){
        service.addAppoinment(appoinment);
    }
    @PutMapping("/update-appoinment")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAppoinment(@RequestBody Appoinment appoinment){
        service.addAppoinment(appoinment);
    }

    @DeleteMapping("/delete-appoinment")
    public Boolean deleteAppoinment(@PathVariable Integer id){
        return service.deleteById(id);
    }

    @GetMapping("/view-all-appoinments")
    public List<Appoinment> getAll(){
        return service.getAll();
    }

    @GetMapping("/get-appoinment-by-id/{id}")
    public Appoinment getAppoinmentById(@PathVariable Integer id){
        return service.getAppoinmentById(id);
    }

    @GetMapping("/get-appoinment-by-admin-id/{id}")
    public List<Appoinment> getAppoinmentByAdminId(@PathVariable Integer id){
        return service.getAppoinmentByAdminId(id);
    }

    @GetMapping("/get-appoinment-by-type/{type}")
    public List<Appoinment> getAppoinmentByType(@PathVariable String type){
        return service.getAppoinmentByType(type);
    }

    @GetMapping("/get-appoinment-by-patientId/{id}")
    public  List<Appoinment> getAppoinmentByPatientId(@PathVariable Integer id){
        return service.getAppoinmentByPatientId(id);
    }
}
