package com.youcode.marjanapi.repositories;

import com.youcode.marjanapi.models.DepartmentUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DepartmentAdministratorRepository extends JpaRepository<DepartmentUser, UUID> {
    Optional<DepartmentUser> findByEmailAndPassword(String email, String password);
}
