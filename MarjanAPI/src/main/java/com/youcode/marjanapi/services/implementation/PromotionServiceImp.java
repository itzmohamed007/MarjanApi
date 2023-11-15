package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.models.Promotion;
import com.youcode.marjanapi.repositories.PromotionRepository;
import com.youcode.marjanapi.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PromotionServiceImp implements PromotionService<Promotion> {
    private final PromotionRepository repository;

    @Autowired
    public PromotionServiceImp(PromotionRepository promotionRepository) {
        this.repository = promotionRepository;
    }

    @Override
    public Optional<Promotion> create(Promotion o) {
        return Optional.empty();
    }

    @Override
    public Optional<Promotion> read(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public List<Promotion> readAll() {
        return null;
    }

    @Override
    public Optional<Promotion> update(Promotion o) {
        return Optional.empty();
    }

    @Override
    public boolean delete(UUID uuid) {
        return false;
    }
}
