package com.blue.bridge.notification.dto;

import java.time.LocalDateTime;
import java.util.Map;

import com.blue.bridge.enums.NotificationType;
import com.blue.bridge.users.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO {

    private long id;

    private String subject;

    @NotBlank(message = "Recipient is required")
    private String recipient;

    private String message;

    private NotificationType type;

    private User user;

    private LocalDateTime createdAT;

    private String templateName;

    private Map<String, Object> templateVariables;
}
