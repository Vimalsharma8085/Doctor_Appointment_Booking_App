package com.example.DoctorAppointmentBookingApp.Repo;

import com.example.DoctorAppointmentBookingApp.Model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment,Integer> {

}
