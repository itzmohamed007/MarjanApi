package com.youcode.marjanapi.repositories;

import com.youcode.marjanapi.models.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AdministratorRepository<T, ID> extends JpaRepository<T, ID> {
    Optional<T> findByEmail(String email);
}