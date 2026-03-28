package com.example.Sample.auth;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.Sample.user.User;

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
        return new AuthResponse(null, message, null); 
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request){
        String token = authService.login(request.getUsername(), request.getPassword());
        return new AuthResponse(token, "Login successful", null);
    }

    @GetMapping("/users")
    public AuthResponse getAllUsers() {
       return new AuthResponse( null,"Access granted",authService.getAllUsers() );
    }

    
    // @GetMapping("/user/{id}")
    // public AuthResponse getUserById(@PathVariable Long id) {
    //   return new AuthResponse(
    //     null,
    //     "Access granted",
    //     authService.getUserById(id)
    // );
    @GetMapping("/user/{id}")
public AuthResponse getUserById(@PathVariable Long id) {

    // ✅ Get logged-in username
    String currentUsername = SecurityContextHolder
            .getContext()
            .getAuthentication()
            .getName();

    // ✅ Get requested user
    User user = authService.getUserById(id);

    // ✅ Check: allow only own data OR ADMIN
    boolean isAdmin = SecurityContextHolder.getContext()
            .getAuthentication()
            .getAuthorities()
            .stream()
            .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"));

    if (!user.getUsername().equals(currentUsername) && !isAdmin) {
        // ❌ BLOCK ACCESS
        throw new ResponseStatusException(
                HttpStatus.FORBIDDEN,
                "You can only access your own data"
        );
    }

    // ✅ ALLOW ACCESS
    return new AuthResponse(null, "Access granted", user);
}
}


