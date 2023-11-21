package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.dtos.ProductDto;
import com.youcode.marjanapi.models.Product;
import com.youcode.marjanapi.services.implementation.ProductServiceImp;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductServiceImp service;
    private final ModelMapper modelMapper;

    @Autowired
    public ProductController (ProductServiceImp productServiceImp, ModelMapper modelMapper) {
        this.service = productServiceImp;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public ResponseEntity<?> readAll() {
        List<Product> products = service.readAll();
        if(products.isEmpty()) {
            return new ResponseEntity<>("No products found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(products, HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody ProductDto productDto) {
        if(service.create(modelMapper.map(productDto, Product.class))) {
            return new ResponseEntity<>("Product creation failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Product created successfully", HttpStatus.CREATED);
    }
}
