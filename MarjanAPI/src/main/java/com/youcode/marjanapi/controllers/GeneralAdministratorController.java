package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.services.implementation.GeneralAdministratorServiceImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/generalAdmin")
public class GeneralAdministratorController {
    private final GeneralAdministratorServiceImp service;

    public GeneralAdministratorController(GeneralAdministratorServiceImp generalAdministratorServiceImp) {
        this.service = generalAdministratorServiceImp;
    }
}
