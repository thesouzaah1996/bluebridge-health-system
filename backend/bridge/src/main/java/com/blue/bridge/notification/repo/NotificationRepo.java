package com.blue.bridge.notification.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blue.bridge.notification.entity.Notification;

public interface NotificationRepo extends JpaRepository<Notification, Long> {
    
}
