package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.CategoryPromotion;
import com.youcode.marjanapi.services.CategoryPromotionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryPromotionServiceImp implements CategoryPromotionService {
    @Override
    public boolean create(CategoryPromotion o) {
        return false;
    }

    @Override
    public Optional<CategoryPromotion> read(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public List<CategoryPromotion> readAll() {
        return null;
    }

    @Override
    public boolean update(CategoryPromotion o) {
        return false;
    }

    @Override
    public boolean delete(UUID uuid) {
        return false;
    }
}
