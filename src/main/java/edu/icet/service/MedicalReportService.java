package edu.icet.service;

import edu.icet.dto.Appoinment;
import edu.icet.dto.MedicalReport;

import java.util.List;

public interface MedicalReportService {
    void addReport(MedicalReport medicalReport);
    List<MedicalReport> getMedicalReports();
    Boolean deleteReport(Integer id);
    List<Appoinment> getAll();
    List<MedicalReport> getMedicalReportByLabNumber(Integer id);
    List<MedicalReport> getMedicalReportByAdminId(Integer id);
    List<MedicalReport> getMedicalReportByCategory(String category);
    List<MedicalReport> getMedicalReportByPatientId(Integer id);
}
