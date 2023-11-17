package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.dtos.CategoryPromotionDto;
import com.youcode.marjanapi.models.CategoryPromotion;
import com.youcode.marjanapi.services.CategoryPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoryPromotion")
public class CategoryPromotionController {
    private final CategoryPromotionService service;

    @Autowired
    public CategoryPromotionController(CategoryPromotionService categoryPromotionService) {
        this.service = categoryPromotionService;
    }

    @GetMapping
    public List<CategoryPromotion> readAll() {
        return service.readAll();
    }

    @PostMapping
    public String create(@RequestBody CategoryPromotionDto requestCategoryPromotion) {
        
    }
}
