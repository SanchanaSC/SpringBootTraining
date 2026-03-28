package com.example.Sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.Sample.auth.JwtFilter;

@Configuration
public class SecurityConfig {
    private final JwtFilter jwtFilter;

    public SecurityConfig(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

//     @Bean
// public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//     http
//         .csrf(csrf -> csrf.disable())
//         .httpBasic(basic -> basic.disable())
//         .formLogin(form -> form.disable())
//         .sessionManagement(session -> session
//                 .sessionCreationPolicy(
//                     org.springframework.security.config.http.SessionCreationPolicy.STATELESS
//                 )
//         )
//         .authorizeHttpRequests(auth -> auth
//                 .requestMatchers("/auth/**").permitAll()
//                 .anyRequest().authenticated()
//         )
//         .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

//     return http.build();
// }
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

    http
        .csrf(csrf -> csrf.disable())
        .httpBasic(basic -> basic.disable())
        .formLogin(form -> form.disable())
        .sessionManagement(session -> session
                .sessionCreationPolicy(
                    org.springframework.security.config.http.SessionCreationPolicy.STATELESS
                )
        )
        .authorizeHttpRequests(auth -> auth

            // ✅ PUBLIC
            .requestMatchers("/auth/register", "/auth/login").permitAll()

            // 👑 ADMIN ONLY
            .requestMatchers("/auth/users").hasRole("ADMIN")

            // 👤 USER + ADMIN
            .requestMatchers("/auth/user/**").hasAnyRole("USER", "ADMIN")

            // 🔒 OTHER
            .anyRequest().authenticated()
        )
        .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

    return http.build();
}

    // @Bean
    // public UserDetailsService userDetailsService() {
    //     return new InMemoryUserDetailsManager();
    // }
}
