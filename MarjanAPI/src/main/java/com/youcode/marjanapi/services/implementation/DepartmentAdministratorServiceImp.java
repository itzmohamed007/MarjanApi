package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.DepartmentUser;
import com.youcode.marjanapi.repositories.DepartmentAdministratorRepository;
import com.youcode.marjanapi.services.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class DepartmentAdministratorServiceImp implements AdministratorService<DepartmentUser> {
    private DepartmentAdministratorRepository repository;

    @Autowired
    public DepartmentAdministratorServiceImp(DepartmentAdministratorRepository departmentAdministratorRepository) {
        this.repository = departmentAdministratorRepository;
    }

    @Override
    public boolean login(DepartmentUser o) {
        return false;
    }

    @Override
    public Optional<DepartmentUser> create(DepartmentUser o) {

        return Optional.empty();
    }

    @Override
    public boolean delete(UUID uuid) {
        return false;
    }
}
