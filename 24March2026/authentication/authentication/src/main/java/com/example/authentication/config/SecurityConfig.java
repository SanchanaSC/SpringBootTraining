// package com.example.authentication.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// import com.example.authentication.auth.JwtFilter;

// @Configuration
// public class SecurityConfig {
//     private final JwtFilter jwtFilter;

//     public SecurityConfig(JwtFilter jwtFilter) {
//         this.jwtFilter = jwtFilter;
//     }
//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http.csrf(csrf->csrf.disable())
//         .authorizeHttpRequests(
//             auth -> auth
//                    .requestMatchers("/auth/register","/auth/login").permitAll()
//                    .anyRequest().authenticated()
//         )
//         .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
//         return http.build();
//     }


// }

package com.example.authentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.authentication.auth.JwtFilter;

@Configuration
public class SecurityConfig {

    private final JwtFilter jwtFilter;

    public SecurityConfig(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            // disable CSRF completely for REST APIs
            .csrf(csrf -> csrf.disable())
            // session management stateless
            .sessionManagement(session -> session
                    .sessionCreationPolicy(
                        org.springframework.security.config.http.SessionCreationPolicy.STATELESS
                    )
            )
            // configure endpoint access
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/auth/register", "/auth/login").permitAll()
                    .anyRequest().authenticated()
            )
            // add JWT filter before Spring Security filter
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
