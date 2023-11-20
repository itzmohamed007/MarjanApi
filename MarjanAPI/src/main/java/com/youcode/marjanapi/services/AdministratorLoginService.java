package com.youcode.marjanapi.services;

import java.util.Optional;

// Will be implemented by General Administrator
public interface AdministratorLoginService<O> {
    boolean login(O o);
}
