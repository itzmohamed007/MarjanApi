package com.youcode.marjanapi.services;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

// Will be implemented by CenterAdministrator and DepartmentAdministrator
public interface AdministratorService<O> extends AdministratorLoginService<O> {
    Optional<O> create(O o);
    boolean delete(UUID uuid);
}
