package edu.icet.service.impl;

import edu.icet.dto.Appointment;
import edu.icet.dto.MedicalReport;
import edu.icet.entity.MedicalReportEntity;
import edu.icet.repository.MedicalReportRepository;
import edu.icet.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalReportServiceImpl implements MedicalReportService {
    final MedicalReportRepository repository;
    final ModelMapper mapper;
    @Override
    public void addReport(MedicalReport medicalReport) {
        repository.save(mapper.map(medicalReport, MedicalReportEntity.class));
    }

    @Override
    public List<MedicalReport> getMedicalReports() {
        return List.of();

    }

    @Override
    public Boolean deleteReport(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<Appointment> getAll() {
        return List.of();
    }

    @Override
    public List<MedicalReport> getMedicalReportByLabNumber(Integer id) {
        return List.of();
    }

    @Override
    public List<MedicalReport> getMedicalReportByAdminId(Integer id) {
        return List.of();
    }

    @Override
    public List<MedicalReport> getMedicalReportByCategory(String category) {
        return List.of();
    }

    @Override
    public List<MedicalReport> getMedicalReportByPatientId(Integer id) {
        return List.of();
    }


    public List<MedicalReport> getMedicalReportsByPatientId(Integer id){
        List<MedicalReport> medicalReports= new ArrayList<>();
        repository.findByPatientId(id).forEach(medicalReportEntity ->{
            medicalReports.add(mapper.map(medicalReportEntity, MedicalReport.class));
        });
        return medicalReports;
    }


}
