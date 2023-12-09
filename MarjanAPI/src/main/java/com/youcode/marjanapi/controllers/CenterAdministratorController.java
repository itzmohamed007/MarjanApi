package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.services.implementation.CenterAdministratorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/centerAdministrator")
public class CenterAdministratorController {
    private final CenterAdministratorServiceImp service;

    @Autowired
    public CenterAdministratorController(CenterAdministratorServiceImp centerAdministratorServiceImp) {
        this.service = centerAdministratorServiceImp;
    }
}
