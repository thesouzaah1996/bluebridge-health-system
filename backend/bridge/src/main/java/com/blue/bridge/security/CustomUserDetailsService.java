package com.blue.bridge.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blue.bridge.exceptions.NotFoundException;
import com.blue.bridge.users.entity.User;
import com.blue.bridge.users.repo.UserRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByEmail(username)
            .orElseThrow(() -> new NotFoundException("Email not found."));

        return AuthUser.builder()
            .user(user)
            .build();
    }
}
