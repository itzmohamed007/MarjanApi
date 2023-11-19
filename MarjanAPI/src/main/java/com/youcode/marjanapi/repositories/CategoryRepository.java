package com.youcode.marjanapi.repositories;

import com.youcode.marjanapi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
