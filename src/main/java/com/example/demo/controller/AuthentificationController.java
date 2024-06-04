package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@Tag(
        name = "Controller for authentification and authorization",
        description = "You can login"
)
public class AuthentificationController {
    @Operation(
            summary = "Endpoint for authentification",
            description = "Endpoint for authentification"
    )
    @PostMapping("/login")
    public ResponseEntity<String> login (
            @RequestParam(name = "login") String username,
            @RequestParam(name = "password") String password
    ){
        return ResponseEntity.ok("Successful login");
    }

    @Operation(
            summary = "Endpoint for registration",
            description = "Endpoint for registration"
    )
    @PostMapping("/register")
    public ResponseEntity<String> register (
            @RequestParam(name = "login") String username,
            @RequestParam(name = "password") String password
    ){
        return ResponseEntity.ok("Successful register");
    }
}
