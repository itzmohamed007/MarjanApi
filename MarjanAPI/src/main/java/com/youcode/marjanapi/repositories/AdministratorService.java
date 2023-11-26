package com.youcode.marjanapi.repositories;

import com.youcode.marjanapi.models.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AdministratorService extends JpaRepository<Administrator, UUID> {
    Optional<Administrator> findByEmail(String email);
}
