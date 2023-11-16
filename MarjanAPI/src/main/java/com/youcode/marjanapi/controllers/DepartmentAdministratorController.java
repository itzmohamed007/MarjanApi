package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.models.DepartmentAdministrator;
import com.youcode.marjanapi.services.implementation.DepartmentAdministratorServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/departmentAdmin")
public class DepartmentAdministratorController {
    private final DepartmentAdministratorServiceImp service;

    public DepartmentAdministratorController(DepartmentAdministratorServiceImp departmentAdministratorServiceImp) {
        this.service = departmentAdministratorServiceImp;
    }
}
