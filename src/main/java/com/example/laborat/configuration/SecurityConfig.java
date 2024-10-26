package com.example.laborat.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())  // Désactive la protection CSRF
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/laboratoires/**").permitAll()  // Autorise tout le monde à accéder à ces routes
                        .anyRequest().authenticated()  // Toutes les autres routes nécessitent une authentification
                );
        return http.build();
    }
}
