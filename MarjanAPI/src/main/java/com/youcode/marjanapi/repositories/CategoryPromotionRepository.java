package com.youcode.marjanapi.repositories;

import com.youcode.marjanapi.models.CategoryPromotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryPromotionRepository extends JpaRepository<CategoryPromotion, UUID> {

}
