package com.vehicle.service.service;

import com.vehicle.service.entity.User;
import com.vehicle.service.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public AuthService(UserRepository repo) { this.repo = repo; }

    public String register(User user) {
        if (repo.findByEmail(user.getEmail()).isPresent())
            throw new IllegalArgumentException("Email already registered");
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        return "Registration successful";
    }

    public String login(String email, String password) {
        User user = repo.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("Invalid email or password"));
        if (!encoder.matches(password, user.getPassword()))
            throw new IllegalArgumentException("Invalid email or password");
        return "Login successful";
    }
}
