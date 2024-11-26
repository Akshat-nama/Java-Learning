package com.akshatnama.project.uber.uberApp.services;

import com.akshatnama.project.uber.uberApp.dto.DriverDto;
import com.akshatnama.project.uber.uberApp.dto.UserDto;

public interface AuthService {
    String login(String email, String password);
    UserDto signup(String email, String password);
    DriverDto onboardNewDriver(Long userId);

}
