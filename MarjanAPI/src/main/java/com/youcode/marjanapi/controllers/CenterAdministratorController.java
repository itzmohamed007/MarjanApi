package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.models.CenterAdministrator;
import com.youcode.marjanapi.services.implementation.CenterAdministratorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/centerAdministrator")
public class CenterAdministratorController {
    private final CenterAdministratorServiceImp service;

    @Autowired
    public CenterAdministratorController(CenterAdministratorServiceImp centerAdministratorServiceImp) {
        this.service = centerAdministratorServiceImp;
    }
}
