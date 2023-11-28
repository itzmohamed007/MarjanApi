package com.youcode.marjanapi.repositories;

import com.youcode.marjanapi.models.CenterUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CenterAdministratorRepository extends JpaRepository<CenterUser, UUID> {
    Optional<CenterUser>findByEmailAndPassword(String email, String password);
}
