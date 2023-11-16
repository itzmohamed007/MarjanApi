package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.services.PromotionService;
import com.youcode.marjanapi.services.implementation.PromotionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/productPromo")
public class ProductPromotionController {
    private final PromotionService service;

    @Autowired
    public ProductPromotionController(PromotionServiceImp promotionServiceImp) {
        this.service = promotionServiceImp;
    }
}
