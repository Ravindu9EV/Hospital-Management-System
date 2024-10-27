package edu.icet.service;

import edu.icet.dto.Appoinment;

import java.util.List;

public interface AppoinmentService {
    void addAppoinment(Appoinment appoinment);
    boolean deleteById(Integer id);
    List<Appoinment> getAll();
    Appoinment getAppoinmentById(Integer id);
    List<Appoinment> getAppoinmentByAdminId(Integer id);
    List<Appoinment> getAppoinmentByType(String type);
    List<Appoinment> getAppoinmentByPatientId(Integer id);
}
