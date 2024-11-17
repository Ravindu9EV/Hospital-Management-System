package edu.icet.service.impl;

import edu.icet.dto.Appointment;
import edu.icet.entity.AppointmentEntity;
import edu.icet.repository.AppointmnetRepository;
import edu.icet.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class AppointmentServiceImpl implements AppointmentService {
    final AppointmnetRepository repository;
    final ModelMapper mapper;
    @Override
    public boolean addAppoinment(Appointment appoinment) {
        log.info(appoinment.toString());
        if(appoinment.getId()==null||
        appoinment.getQr()==null||
        appoinment.getAdminId()==null||
        appoinment.getDateTime()==null||
        appoinment.getPatientId()==null){
            return false;
        }
        try{

            AppointmentEntity appointmentEntity=mapper.map(appoinment, AppointmentEntity.class);
            repository.save(appointmentEntity);

        }catch (NullPointerException e){
            log.info(e.toString());
            return false;
        }
        return true;

    }

    @Override
    public boolean deleteById(Integer id) {
        if(id==null){
            return false;
        }
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<Appointment> getAll() {
        List<Appointment> appoinments=new ArrayList<>();
        repository.findAll().forEach(appointmentEntity -> {
            appoinments.add(mapper.map(appointmentEntity, Appointment.class));
        });
        return appoinments;
    }

    @Override
    public Appointment getAppoinmentById(Integer id) {
        return null;
    }

    @Override
    public List<Appointment> getAppoinmentByAdminId(Integer id) {
        List<Appointment> appoinments=new ArrayList<>();
        repository.findByAdminId(id).forEach(appointmentEntity -> {
            appoinments.add(mapper.map(appointmentEntity, Appointment.class));
        });
        return appoinments;
    }

    @Override
    public List<Appointment> getAppoinmentByType(String type) {
        List<Appointment> appoinments=new ArrayList<>();
        repository.findByType(type).forEach(appointmentEntity -> {
            appoinments.add(mapper.map(appointmentEntity, Appointment.class));
        });
        return appoinments;
    }

    @Override
    public List<Appointment> getAppoinmentByPatientId(Integer id) {
       List<Appointment> appoinments=new ArrayList<>();
       repository.findByPatientId(id).forEach(appointmentEntity -> {
           appoinments.add(mapper.map(appointmentEntity, Appointment.class));
       });
       return appoinments;
    }
}
