package com.blue.bridge.patient.dto;

import java.time.LocalDate;

import com.blue.bridge.enums.BloodGroup;
import com.blue.bridge.enums.Genotype;
import com.blue.bridge.users.dto.UserDTO;

public class PatientDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String phone;

    private String knownAllergies;

    private BloodGroup bloodGroup;

    private Genotype genotype;

    private UserDTO user;
}
