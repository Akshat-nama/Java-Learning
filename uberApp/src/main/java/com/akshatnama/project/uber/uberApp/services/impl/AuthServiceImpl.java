package com.akshatnama.project.uber.uberApp.services.impl;

import com.akshatnama.project.uber.uberApp.dto.DriverDto;
import com.akshatnama.project.uber.uberApp.dto.UserDto;
import com.akshatnama.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(String email, String password) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
