package edu.icet.controller;

import edu.icet.dto.MedicalReport;
import edu.icet.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/medical-report")
@RequiredArgsConstructor
public class MedicalReportController {

    final MedicalReportService service;

    @PostMapping("add-report")
    public void addMedicalReport(@RequestBody MedicalReport medicalReport){
        service.addReport(medicalReport);
    }

}
