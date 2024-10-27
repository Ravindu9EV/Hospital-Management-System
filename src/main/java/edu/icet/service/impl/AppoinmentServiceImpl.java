package edu.icet.service.impl;

import edu.icet.dto.Appoinment;
import edu.icet.entity.AppoinmentEntity;
import edu.icet.repository.AppoinmnetRepository;
import edu.icet.service.AppoinmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class AppoinmentServiceImpl implements AppoinmentService {
    final AppoinmnetRepository repository;
    final ModelMapper mapper;
    @Override
    public void addAppoinment(Appoinment appoinment) {
        log.info(appoinment.toString());
        repository.save(mapper.map(appoinment, AppoinmentEntity.class));
    }

    @Override
    public boolean deleteById(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<Appoinment> getAll() {
        List<Appoinment> appoinments=new ArrayList<>();
        repository.findAll().forEach(appoinmentEntity -> {
            appoinments.add(mapper.map(appoinmentEntity, Appoinment.class));
        });
        return appoinments;
    }

    @Override
    public Appoinment getAppoinmentById(Integer id) {
        return null;
    }

    @Override
    public List<Appoinment> getAppoinmentByAdminId(Integer id) {
        List<Appoinment> appoinments=new ArrayList<>();
        repository.findByAdminId(id).forEach(appoinmentEntity -> {
            appoinments.add(mapper.map(appoinmentEntity, Appoinment.class));
        });
        return appoinments;
    }

    @Override
    public List<Appoinment> getAppoinmentByType(String type) {
        List<Appoinment> appoinments=new ArrayList<>();
        repository.findByType(type).forEach(appoinmentEntity -> {
            appoinments.add(mapper.map(appoinmentEntity, Appoinment.class));
        });
        return appoinments;
    }

    @Override
    public List<Appoinment> getAppoinmentByPatientId(Integer id) {
       List<Appoinment> appoinments=new ArrayList<>();
       repository.findByPatientId(id).forEach(appoinmentEntity -> {
           appoinments.add(mapper.map(appoinmentEntity, Appoinment.class));
       });
       return appoinments;
    }
}
