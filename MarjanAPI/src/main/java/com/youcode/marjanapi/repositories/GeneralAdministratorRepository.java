package com.youcode.marjanapi.repositories;

import com.youcode.marjanapi.models.GeneralUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface GeneralAdministratorRepository extends JpaRepository<GeneralUser, UUID> {
    Optional<GeneralUser> findByEmailAndPassword(String email, String password);
}
