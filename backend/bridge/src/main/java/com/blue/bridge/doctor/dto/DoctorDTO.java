package com.blue.bridge.doctor.dto;

import com.blue.bridge.enums.Specialization;
import com.blue.bridge.users.dto.UserDTO;

public class DoctorDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private Specialization specialization;

    private String licenseNumber;

    private UserDTO user;
}
