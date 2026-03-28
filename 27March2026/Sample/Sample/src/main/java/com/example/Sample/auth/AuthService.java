package com.example.Sample.auth;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Sample.user.User;
import com.example.Sample.user.UserRepository;

@Service
public class AuthService {
    private  final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    // public String register(String username, String password) {

    //     if (userRepository.findByUsername(username).isPresent()) {
    //         throw new RuntimeException("User already exists");
    //     }

    //     String hashedPassword = passwordEncoder.encode(password);

    //     User user = new User();
    //     user.setUsername(username);
    //     user.setPassword(hashedPassword);
    //     userRepository.save(user);

    //     return "User Registered Successfully";
    // }

    public String register(String username, String password) {

    if (userRepository.findByUsername(username).isPresent()) {
        throw new RuntimeException("User already exists");
    }

    String hashedPassword = passwordEncoder.encode(password);

    User user = new User();
    user.setUsername(username);
    user.setPassword(hashedPassword);

    user.setRole("USER"); // ✅ DEFAULT ROLE

    userRepository.save(user);

    return "User Registered Successfully";
  }
    // public String login(String username, String password) {

    //     User user = userRepository.findByUsername(username)
    //             .orElseThrow(() -> new RuntimeException("User not found"));

    //     boolean isMatch = passwordEncoder.matches(password, user.getPassword());

    //     if (!isMatch) {
    //         throw new RuntimeException("Invalid credentials");
    //     }

    //     return jwtUtil.generateToken(username);
    // }
    public String login(String username, String password) {

      User user = userRepository.findByUsername(username)
            .orElseThrow(() -> new RuntimeException("User not found"));

      if (!passwordEncoder.matches(password, user.getPassword())) {
        throw new RuntimeException("Invalid credentials");
      }

      return jwtUtil.generateToken(user.getUsername(), user.getRole()); // ✅ PASS ROLE
   }
   
   public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.findById(id)
        .orElseThrow(()->new RuntimeException("User not found"));
    }
}