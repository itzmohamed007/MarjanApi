package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.ProductPromotion;
import com.youcode.marjanapi.repositories.ProductPromotionRepository;
import com.youcode.marjanapi.services.ProductPromotionService;
import com.youcode.marjanapi.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductPromotionServiceImp implements ProductPromotionService {
    private final ProductPromotionRepository repository;

    @Autowired
    public ProductPromotionServiceImp(ProductPromotionRepository productPromotionRepository) {
        this.repository = productPromotionRepository;
    }

    @Override
    public boolean create(ProductPromotion productPromotion) {
        try {
            repository.save(productPromotion);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<ProductPromotion> read(UUID uuid) {
        return repository.findById(uuid);
    }

    @Override
    public List<ProductPromotion> readAll() {
        return repository.findAll();
    }

    @Override
    public boolean update(ProductPromotion requestProductPromotion) {
        Optional<ProductPromotion> promotion = repository.findById(requestProductPromotion.getUuid());
        if(promotion.isPresent()) {
            repository.save(requestProductPromotion);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(UUID uuid) {
        Optional<ProductPromotion> promotion = repository.findById(uuid);
        if(promotion.isPresent()) {
            repository.deleteById(uuid);
            return true;
        }
        return false;
    }
}
