package com.youcode.marjanapi.repositories;

import com.youcode.marjanapi.models.ProductPromotion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductPromotionRepository extends JpaRepository<ProductPromotion, UUID> {
    Page<ProductPromotion> findAll(Pageable pageable);
}
