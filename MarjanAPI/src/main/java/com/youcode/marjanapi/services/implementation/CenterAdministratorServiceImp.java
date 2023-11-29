package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.CenterUser;
import com.youcode.marjanapi.repositories.CenterAdministratorRepository;
import com.youcode.marjanapi.services.AdministratorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CenterAdministratorServiceImp implements AdministratorService<CenterUser> {
    private CenterAdministratorRepository repository;

    @Autowired
    public CenterAdministratorServiceImp(CenterAdministratorRepository centerAdministratorRepository, ModelMapper modelMapper) {
        this.repository = centerAdministratorRepository;
    }

    @Override
    public boolean login(CenterUser o) {
        return false;
    }

    @Override
    public Optional<CenterUser> create(CenterUser o) {
        return Optional.empty();
    }

    @Override
    public boolean delete(UUID uuid) {
        return false;
    }
}
