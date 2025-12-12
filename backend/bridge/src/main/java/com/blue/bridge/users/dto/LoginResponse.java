package com.blue.bridge.users.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {

    private String token;
    private List<String> roles;
}
