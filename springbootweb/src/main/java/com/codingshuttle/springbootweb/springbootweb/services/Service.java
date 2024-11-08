package com.codingshuttle.springbootweb.springbootweb.services;

import com.codingshuttle.springbootweb.springbootweb.exceptions.ResourceNotFoundException;
import com.codingshuttle.springbootweb.springbootweb.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username)
                .orElseThrow(() -> new ResourceNotFoundException("User with the email "+ username + "not found"));
    }
}
