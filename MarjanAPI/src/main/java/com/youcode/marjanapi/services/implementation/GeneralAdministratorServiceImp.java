package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.GeneralAdministrator;
import com.youcode.marjanapi.repositories.GeneralAdministratorRepository;
import com.youcode.marjanapi.services.AdministratorLoginService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GeneralAdministratorServiceImp implements AdministratorLoginService<GeneralAdministrator> {
    private final GeneralAdministratorRepository repository;

    @Autowired
    public GeneralAdministratorServiceImp(GeneralAdministratorRepository generalAdministratorRepository, ModelMapper modelMapper) {
        this.repository = generalAdministratorRepository;
    }

    @Override
    public boolean login(GeneralAdministrator requestGeneralAdministrator) {
        Optional<GeneralAdministrator> generalAdministrator = repository.findByEmailAndPassword(requestGeneralAdministrator.getEmail(), requestGeneralAdministrator.getPassword());
        return generalAdministrator.isPresent();
    }
}
