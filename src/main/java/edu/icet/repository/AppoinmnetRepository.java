package edu.icet.repository;

import edu.icet.entity.AppoinmentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppoinmnetRepository extends CrudRepository<AppoinmentEntity,Integer> {
    List<AppoinmentEntity> findByAdminId(Integer id);
    List<AppoinmentEntity> findByType(String type);
    List<AppoinmentEntity> findByPatientId(Integer id);
}
