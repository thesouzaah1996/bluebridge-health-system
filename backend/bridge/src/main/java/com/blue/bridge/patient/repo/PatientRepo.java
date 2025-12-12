package com.blue.bridge.patient.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blue.bridge.patient.entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Long>{
    Optional<Patient> findByUser(String user);
}
