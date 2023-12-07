package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.dtos.RegistrationDto;
import com.youcode.marjanapi.dtos.responses.RegistrationRes;
import com.youcode.marjanapi.models.User;
import com.youcode.marjanapi.services.implementation.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;
    @PostMapping
    public ResponseEntity<?> register(@Valid @RequestBody RegistrationDto registrationDto) {
        User user = userService.register(modelMapper.map(registrationDto, User.class));
        if(user == null) return new ResponseEntity<>("User Creation Failed", HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(modelMapper.map(user, RegistrationRes.class), HttpStatus.CREATED);
    }
}
