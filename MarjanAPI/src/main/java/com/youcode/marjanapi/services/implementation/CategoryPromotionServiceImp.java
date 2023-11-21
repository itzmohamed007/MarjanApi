package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.CategoryPromotion;
import com.youcode.marjanapi.repositories.CategoryPromotionRepository;
import com.youcode.marjanapi.services.CategoryPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryPromotionServiceImp implements CategoryPromotionService {
    private final CategoryPromotionRepository repository;

    @Autowired
    public CategoryPromotionServiceImp(CategoryPromotionRepository categoryPromotionRepository) {
        this.repository = categoryPromotionRepository;
    }

    @Override
    public boolean create(CategoryPromotion categoryPromotion) {
        try {
            repository.save(categoryPromotion);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<CategoryPromotion> read(UUID uuid) {
        return repository.findById(uuid);
    }

    @Override
    public List<CategoryPromotion> readAll() {
        return repository.findAll();
    }

    @Override
    public boolean update(CategoryPromotion requestCategoryPromotion) {
        Optional<CategoryPromotion> categoryPromotion = repository.findById(requestCategoryPromotion.getUuid());
        if (categoryPromotion.isPresent()) {
            repository.save(requestCategoryPromotion);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(UUID uuid) {
        Optional<CategoryPromotion> categoryPromotion = repository.findById(uuid);
        if (categoryPromotion.isPresent()) {
            repository.deleteById(uuid);
            return true;
        }
        return false;
    }
}
