package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.CenterAdministrator;
import com.youcode.marjanapi.repositories.CenterAdministratorRepository;
import com.youcode.marjanapi.services.AdministratorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CenterAdministratorServiceImp implements AdministratorService<CenterAdministrator> {
    private CenterAdministratorRepository repository;

    @Autowired
    public CenterAdministratorServiceImp(CenterAdministratorRepository centerAdministratorRepository, ModelMapper modelMapper) {
        this.repository = centerAdministratorRepository;
    }

    @Override
    public boolean login(CenterAdministrator o) {
        return false;
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
