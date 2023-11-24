package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.dtos.ProductDto;
import com.youcode.marjanapi.dtos.responses.ProductCategoryRes;
import com.youcode.marjanapi.dtos.responses.ProductRes;
import com.youcode.marjanapi.models.Product;
import com.youcode.marjanapi.services.implementation.ProductServiceImp;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        List<ProductCategoryRes> products = service.readAll().stream()
                .map(product -> modelMapper.map(product, ProductCategoryRes.class))
                .toList();
        if(products.isEmpty()) {
            return new ResponseEntity<>("No products found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        if(service.create(product)) {
            return new ResponseEntity<>("Product created successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Product created failed", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
