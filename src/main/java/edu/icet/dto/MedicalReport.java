package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MedicalReport {
    private String category;
    private String pdfSrc;
    private LocalDate dateTime;
    private Integer patientId;
    private Integer adminId;
    private Integer labNumber;
}
