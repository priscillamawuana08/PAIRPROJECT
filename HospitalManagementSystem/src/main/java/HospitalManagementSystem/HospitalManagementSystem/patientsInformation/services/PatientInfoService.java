package HospitalManagementSystem.HospitalManagementSystem.patientsInformation.services;

import HospitalManagementSystem.HospitalManagementSystem.patientsInformation.Entities.PatientInfo;
import HospitalManagementSystem.HospitalManagementSystem.patientsInformation.repositories.PatientRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PatientService {
    @Autowired
    private PatientRepo patientRepo;

    public PatientInfo savePatientInfo(PatientInfo patientInfo){
        return patientRepo.save(patientInfo);

    }

}
