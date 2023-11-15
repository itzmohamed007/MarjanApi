package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.CenterAdministrator;
import com.youcode.marjanapi.repositories.CenterAdministratorRepository;
import com.youcode.marjanapi.services.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CenterAdministratorServiceImp implements AdministratorService<CenterAdministrator> {
    private CenterAdministratorRepository repository;

    @Autowired
    public CenterAdministratorServiceImp(CenterAdministratorRepository centerAdministratorRepository) {
        this.repository = centerAdministratorRepository;
    }

    @Override
    public Optional<CenterAdministrator> login(CenterAdministrator o) {
        return Optional.empty();
    }

    @Override
    public Optional<CenterAdministrator> create(CenterAdministrator o) {
        return Optional.empty();
    }

    @Override
    public boolean delete(UUID uuid) {
        return false;
    }
}
