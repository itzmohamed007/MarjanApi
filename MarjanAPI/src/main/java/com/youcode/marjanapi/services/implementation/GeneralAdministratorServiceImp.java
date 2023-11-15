package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.GeneralAdministrator;
import com.youcode.marjanapi.repositories.GeneralAdministratorRepository;
import com.youcode.marjanapi.services.AdministratorLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GeneralAdministratorServiceImp implements AdministratorLoginService<GeneralAdministrator> {
    private GeneralAdministratorRepository repository;

    @Autowired
    public GeneralAdministratorServiceImp(GeneralAdministratorRepository generalAdministratorRepository) {
        this.repository = generalAdministratorRepository;
    }

    @Override
    public Optional<GeneralAdministrator> login(GeneralAdministrator o) {
        return Optional.empty();
    }
}
