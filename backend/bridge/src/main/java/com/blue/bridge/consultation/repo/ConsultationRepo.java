package com.blue.bridge.consultation.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blue.bridge.consultation.entity.Consultation;

public interface ConsultationRepo extends JpaRepository<Consultation, Long> {

    Optional<Consultation> findByAppointmentId(Long appointmentId);

    List<Consultation> findByAppointmentPatientIdOrderByConsultationDateDesc(Long patientId);
}
