package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.services.ProductPromotionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productPromo")
public class ProductPromotionController {
    private final ProductPromotionService service;
    private final ModelMapper modelMapper;

    @Autowired
    public ProductPromotionController(ProductPromotionService productPromotionService, ModelMapper modelMapper) {
        this.service = productPromotionService;
        this.modelMapper = modelMapper;
    }
}
