package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.services.implementation.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductServiceImp service;

    @Autowired
    public ProductController (ProductServiceImp productServiceImp) {
        this.service = productServiceImp;
    }
}
