package com.ma.demo.controller;

import com.ma.demo.model.LoginRequest;
import com.ma.demo.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        // Demo hardcoded user (bisa diganti dengan validasi dari DB nanti)
        if ("admin".equals(request.getUsername()) && "password".equals(request.getPassword())) {
            return jwtService.generateToken(request.getUsername());
        }
        throw new RuntimeException("Username/password salah");
    }
}
