package edu.icet.repository;

import edu.icet.dto.MedicalReport;
import edu.icet.entity.MedicalReportEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicalReportRepository extends CrudRepository<MedicalReportEntity,Integer> {
    List<MedicalReportEntity> findByPatientId(Integer id);
    List<MedicalReportEntity> findByLabNumber(Integer id);
    List<MedicalReportEntity> findByCategory(String category);
}
