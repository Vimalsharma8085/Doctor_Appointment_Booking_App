package com.example.DoctorAppointmentBookingApp.Model.dto;

import com.example.DoctorAppointmentBookingApp.Model.Appointment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleAppointmentDTO {
    AuthenticationInputDto authInfo;
    Appointment appointment;
}
