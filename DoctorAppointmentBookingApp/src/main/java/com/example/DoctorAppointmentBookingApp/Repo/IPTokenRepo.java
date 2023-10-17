package com.example.DoctorAppointmentBookingApp.Repo;

import com.example.DoctorAppointmentBookingApp.Model.PatientAuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPTokenRepo extends JpaRepository<PatientAuthenticationToken,Integer> {
    PatientAuthenticationToken findFirstByTokenValue(String tokenValue);
}
