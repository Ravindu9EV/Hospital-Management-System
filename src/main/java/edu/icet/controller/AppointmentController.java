package edu.icet.controller;

import edu.icet.dto.Appointment;
import edu.icet.service.AppointmentService;
import lombok.RequiredArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
@CrossOrigin

public class AppointmentController {
    private static final Logger log = LoggerFactory.getLogger(AppointmentController.class);
    final AppointmentService service;

    @PostMapping("/add-appointment")
    @ResponseStatus(HttpStatus.OK)
    public boolean addAppointment(@RequestBody Appointment appointment){
        System.out.println(appointment);
       return service.addAppoinment(appointment);
    }
    @PutMapping("/update-appointment")

    public boolean updateAppointment(@RequestBody Appointment appointment){
        log.info("{}    --  {}",Thread.currentThread().getName(),appointment);
       return service.addAppoinment(appointment);

    }

    @DeleteMapping("/delete-appointment/filter")
    public Boolean deleteAppointment(@RequestParam Integer id){
        return service.deleteById(id);
    }

    @GetMapping("/view-all-appointments")
    public List<Appointment> getAll(){
        return service.getAll();
    }

    @GetMapping("/get-appointment-by-id/{id}")
    public Appointment getAppointmentById(@PathVariable Integer id){
        return service.getAppoinmentById(id);
    }

    @GetMapping("/get-appointment-by-admin-id/{id}")
    public List<Appointment> getAppointmentByAdminId(@PathVariable Integer id){
        return service.getAppoinmentByAdminId(id);
    }

    @GetMapping("/get-appointment-by-type/{type}")
    public List<Appointment> getAppointmentByType(@PathVariable String type){
        return service.getAppoinmentByType(type);
    }

    @GetMapping("/get-appointment-by-patientId/{id}")
    public  List<Appointment> getAppointmentByPatientId(@PathVariable Integer id){
        return service.getAppoinmentByPatientId(id);
    }
}
