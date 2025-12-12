package com.blue.bridge.doctor.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blue.bridge.doctor.entity.Doctor;
import com.blue.bridge.enums.Specialization;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    Optional<Doctor> findByUser(String user);

    List<Doctor> findBySpecialization(Specialization specialization);
}
