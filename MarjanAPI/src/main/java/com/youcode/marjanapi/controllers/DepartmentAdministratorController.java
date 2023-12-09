package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.services.implementation.DepartmentAdministratorServiceImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/departmentAdmin")
public class DepartmentAdministratorController {
    private final DepartmentAdministratorServiceImp service;

    public DepartmentAdministratorController(DepartmentAdministratorServiceImp departmentAdministratorServiceImp) {
        this.service = departmentAdministratorServiceImp;
    }
}
