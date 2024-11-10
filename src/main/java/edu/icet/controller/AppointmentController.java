package edu.icet.controller;

import edu.icet.dto.Appointment;
import edu.icet.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
@CrossOrigin
public class AppointmentController {
    final AppointmentService service;

    @PostMapping("/add-appointment")
    @ResponseStatus(HttpStatus.OK)
    public void addAppoinment(@RequestBody Appointment appoinment){
        System.out.println(appoinment);
        service.addAppoinment(appoinment);
    }
    @PutMapping("/update-appoinment")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateAppoinment(@RequestBody Appointment appoinment){
        service.addAppoinment(appoinment);
    }

    @DeleteMapping("/delete-appoinment")
    public Boolean deleteAppoinment(@PathVariable Integer id){
        return service.deleteById(id);
    }

    @GetMapping("/view-all-appoinments")
    public List<Appointment> getAll(){
        return service.getAll();
    }

    @GetMapping("/get-appoinment-by-id/{id}")
    public Appointment getAppoinmentById(@PathVariable Integer id){
        return service.getAppoinmentById(id);
    }

    @GetMapping("/get-appoinment-by-admin-id/{id}")
    public List<Appointment> getAppoinmentByAdminId(@PathVariable Integer id){
        return service.getAppoinmentByAdminId(id);
    }

    @GetMapping("/get-appoinment-by-type/{type}")
    public List<Appointment> getAppoinmentByType(@PathVariable String type){
        return service.getAppoinmentByType(type);
    }

    @GetMapping("/get-appoinment-by-patientId/{id}")
    public  List<Appointment> getAppoinmentByPatientId(@PathVariable Integer id){
        return service.getAppoinmentByPatientId(id);
    }
}
