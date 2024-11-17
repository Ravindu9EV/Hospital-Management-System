package edu.icet.service;

import edu.icet.dto.Appointment;

import java.util.List;

public interface AppointmentService {
    boolean addAppoinment(Appointment appoinment);
    boolean deleteById(Integer id);
    List<Appointment> getAll();
    Appointment getAppoinmentById(Integer id);
    List<Appointment> getAppoinmentByAdminId(Integer id);
    List<Appointment> getAppoinmentByType(String type);
    List<Appointment> getAppoinmentByPatientId(Integer id);
}
