package com.example.authentication.auth;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest request){
        String message = authService.register(request.getUsername(), request.getPassword());
        return new AuthResponse(null, message);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request){
        String token = authService.login(request.getUsername(), request.getPassword());
        return new AuthResponse(token,"Login successful");
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello, you are Authenticated";
    }
}