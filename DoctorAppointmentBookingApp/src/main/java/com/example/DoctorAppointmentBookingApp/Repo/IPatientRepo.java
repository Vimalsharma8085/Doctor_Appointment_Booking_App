package com.example.DoctorAppointmentBookingApp.Repo;

import com.example.DoctorAppointmentBookingApp.Model.BloodGroup;
import com.example.DoctorAppointmentBookingApp.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPatientRepo extends JpaRepository<Patient,Integer> {
    Patient findFirstByPatientEmail(String newEmail);

    List<Patient> findByPatientBloodGroup(BloodGroup bloodGroup);
}
