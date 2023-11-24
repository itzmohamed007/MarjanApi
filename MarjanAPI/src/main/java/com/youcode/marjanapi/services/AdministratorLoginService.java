package com.youcode.marjanapi.services;

// Will be implemented by General Administrator
public interface AdministratorLoginService<O> {
    boolean login(O o);
}
