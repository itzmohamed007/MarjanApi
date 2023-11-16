package com.youcode.marjanapi.services;

import org.springframework.stereotype.Service;

import java.util.Optional;

// Will be implemented by General Administrator
public interface AdministratorLoginService<O> {
    Optional<O> login(O o);
}
