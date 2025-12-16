package com.blue.bridge.users.service;

import com.blue.bridge.res.Response;
import com.blue.bridge.users.dto.LoginRequest;
import com.blue.bridge.users.dto.LoginResponse;
import com.blue.bridge.users.dto.RegistrationRequest;
import com.blue.bridge.users.dto.ResetPasswordRequest;

public class AuthServiceImp implements AuthService {

    @Override
    public Response<String> register(RegistrationRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }

    @Override
    public Response<LoginResponse> login(LoginRequest loginRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public Response<?> AuthService(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AuthService'");
    }

    @Override
    public Response<?> updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePasswordViaResetCode'");
    }

}
