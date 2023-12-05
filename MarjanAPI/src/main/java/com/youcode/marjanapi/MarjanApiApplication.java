package com.youcode.marjanapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost/56739")
@SpringBootApplication
public class MarjanApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MarjanApiApplication.class, args);
    }
}
