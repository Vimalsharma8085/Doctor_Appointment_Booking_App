package com.example.DoctorAppointmentBookingApp.Controller;

import com.example.DoctorAppointmentBookingApp.Model.BloodGroup;
import com.example.DoctorAppointmentBookingApp.Model.Doctor;
import com.example.DoctorAppointmentBookingApp.Model.Patient;
import com.example.DoctorAppointmentBookingApp.Service.DoctorService;
import com.example.DoctorAppointmentBookingApp.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Validated
public class AdminController {
    @Autowired
    DoctorService doctorService;

    @Autowired
    PatientService patientService;

    @GetMapping("patients")
    public List<Patient> getAllPatients()
    {
        return patientService.getAllPatients();
    }

    @PostMapping("doctor")
    public String addDoctor(@RequestBody Doctor newDoctor)
    {
        return doctorService.addDoctor(newDoctor);
    }

    @GetMapping("patients/bloodGroup/{bloodGroup}")
    public List<Patient> getAllPatientsByBloodGroup(@PathVariable BloodGroup bloodGroup)
    {
        return patientService.getAllPatientsByBloodGroup(bloodGroup);
    }

}
