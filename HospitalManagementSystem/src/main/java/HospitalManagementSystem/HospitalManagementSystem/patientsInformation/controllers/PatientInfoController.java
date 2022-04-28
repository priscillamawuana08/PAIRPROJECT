package HospitalManagementSystem.HospitalManagementSystem.patientsInformation.controllers;

import HospitalManagementSystem.HospitalManagementSystem.patientsInformation.Entities.PatientInfo;
import HospitalManagementSystem.HospitalManagementSystem.patientsInformation.services.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/patient/")
public class PatientInfoContoller {
    @Autowired
    private PatientService patientService;

    @PostMapping("save")
    public ResponseEntity<PatientInfo> savePatientInfo(@RequestBody PatientInfo patientInfo){
        return new ResponseEntity<>(patientService.savePatientInfo(patientInfo), HttpStatus.OK);
    }
}
