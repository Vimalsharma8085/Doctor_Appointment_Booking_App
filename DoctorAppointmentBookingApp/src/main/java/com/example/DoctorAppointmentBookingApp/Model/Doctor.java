package com.example.DoctorAppointmentBookingApp.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,scope = Doctor.class,property = "docId")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer docId;
    @NotBlank
    private String  docName;
    private double  docFee;

    @Enumerated(value = EnumType.STRING)
    private Specialization docSpecialization;

    @Enumerated(value = EnumType.STRING)
    private Qualification docQualification;

    private String docContact;

    @OneToMany(mappedBy = "doctor")
    List<Appointment> appointments;


}
