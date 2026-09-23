package com.vehicle.service.controller;

import com.vehicle.service.entity.User;
import com.vehicle.service.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController @RequestMapping("/api/auth")
public class AuthController {
    private final AuthService service;
    public AuthController(AuthService service) { this.service = service; }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public String register(@RequestBody User user) { return service.register(user); }

    @PostMapping("/login")
    public String login(@RequestBody Map<String,String> body) {
        return service.login(body.get("email"), body.get("password"));
    }
}
