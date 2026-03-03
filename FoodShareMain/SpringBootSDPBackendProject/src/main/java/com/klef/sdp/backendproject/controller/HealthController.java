package com.klef.sdp.backendproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.time.LocalDateTime;

@RestController
@CrossOrigin("*")
public class HealthController {

    @GetMapping("/")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.ok(Map.of(
            "status", "UP",
            "message", "FoodShare API is running",
            "timestamp", LocalDateTime.now().toString(),
            "endpoints", Map.of(
                "register", "POST /api/v1/users/register",
                "login", "POST /api/v1/auth/login",
                "admin_users", "GET /api/v1/admin/users",
                "donations", "GET /api/v1/donations"
            )
        ));
    }

    @GetMapping("/health")
    public ResponseEntity<?> health() {
        return ResponseEntity.ok(Map.of("status", "UP"));
    }
}
