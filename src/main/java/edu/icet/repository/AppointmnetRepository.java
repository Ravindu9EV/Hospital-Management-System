package edu.icet.repository;

import edu.icet.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmnetRepository extends JpaRepository<AppointmentEntity,Integer> {
    List<AppointmentEntity> findByAdminId(Integer id);
    List<AppointmentEntity> findByType(String type);
    List<AppointmentEntity> findByPatientId(Integer id);
}
