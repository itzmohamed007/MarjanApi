package com.youcode.marjanapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class MarjanApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MarjanApiApplication.class, args);
    }
}
