package com.example.DoctorAppointmentBookingApp.Controller;

import com.example.DoctorAppointmentBookingApp.Model.Doctor;
import com.example.DoctorAppointmentBookingApp.Model.Patient;
import com.example.DoctorAppointmentBookingApp.Model.Qualification;
import com.example.DoctorAppointmentBookingApp.Model.Specialization;
import com.example.DoctorAppointmentBookingApp.Model.dto.AuthenticationInputDto;
import com.example.DoctorAppointmentBookingApp.Model.dto.ScheduleAppointmentDTO;
import com.example.DoctorAppointmentBookingApp.Model.dto.SignInInputDto;
import com.example.DoctorAppointmentBookingApp.Service.AppoinmentService;
import com.example.DoctorAppointmentBookingApp.Service.DoctorService;
import com.example.DoctorAppointmentBookingApp.Service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    AppoinmentService appoinmentService;

    @Autowired
    DoctorService doctorService;


    //sign up
    @PostMapping("patient/signup")
    public String patientSignUp(@Valid @RequestBody Patient patient)
    {
        return patientService.patientSignUp(patient);
    }



    //sign in
    @PostMapping("patient/signIn")
    public String patientSignIn(@RequestBody SignInInputDto signInInput)
    {
        return patientService.patientSignIn(signInInput);
    }


    //sign out
    @DeleteMapping("patient/signOut")
    public String patientSignOut(@RequestBody AuthenticationInputDto authInfo)
    {
        return patientService.patientSignOut(authInfo);
    }


    //schedule an appointment

    @PostMapping("patient/appointment/schedule")
    public String scheduleAppointment(@RequestBody ScheduleAppointmentDTO scheduleAppointmentDTO)
    {
        return appoinmentService.scheduleAppointment(scheduleAppointmentDTO.getAuthInfo(),scheduleAppointmentDTO.getAppointment());
    }

    @DeleteMapping("patient/appointment/{appointmentId}/cancel")
    public String cancelAppointment(@RequestBody AuthenticationInputDto authInfo, @PathVariable Integer appointmentId)
    {
        return appoinmentService.cancelAppointment(authInfo,appointmentId);
    }

    @GetMapping("doctors/qualification/{qual}/or/specialization/{spec}")
    public List<Doctor> getDoctorsByQualificationOrSpec(@RequestBody AuthenticationInputDto authInfo, @PathVariable Qualification qual, @PathVariable Specialization spec)
    {
        return doctorService.getDoctorsByQualificationOrSpec(authInfo,qual,spec);
    }


}