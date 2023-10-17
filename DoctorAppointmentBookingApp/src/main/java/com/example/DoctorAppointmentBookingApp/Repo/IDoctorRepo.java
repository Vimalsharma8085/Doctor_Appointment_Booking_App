package com.example.DoctorAppointmentBookingApp.Repo;

import com.example.DoctorAppointmentBookingApp.Model.Doctor;
import com.example.DoctorAppointmentBookingApp.Model.Qualification;
import com.example.DoctorAppointmentBookingApp.Model.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDoctorRepo extends JpaRepository<Doctor,Integer> {

    List<Doctor> findByDocQualificationOrDocSpecialization(Qualification qual, Specialization spec);
}
