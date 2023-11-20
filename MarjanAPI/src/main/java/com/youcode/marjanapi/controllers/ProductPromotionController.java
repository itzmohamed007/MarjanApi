package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.services.ProductPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productPromo")
public class ProductPromotionController {
    private final ProductPromotionService service;

    @Autowired
    public ProductPromotionController(ProductPromotionService productPromotionService) {
        this.service = productPromotionService;
    }
}
