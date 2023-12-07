package com.youcode.marjanapi;

import com.youcode.marjanapi.enums.Role;
import com.youcode.marjanapi.models.User;
import com.youcode.marjanapi.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost/56739")
@SpringBootApplication
public class MarjanApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MarjanApiApplication.class, args);
    }
    // automatically inserting a administrator account
    @Bean
    CommandLineRunner run(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            String adminEmailAddress = "itzmohamed007@gmail.com";
            Optional<User> existingUser = userRepository.findByEmail(adminEmailAddress);
            if(existingUser.isEmpty()) {
                User user = new User();
                user.setEmail(adminEmailAddress);
                user.setPassword(passwordEncoder.encode("mohamed"));
                user.setRole(Role.ROLE_GENERAL_ADMIN);
                userRepository.save(user);
            }
        };
    }
}
