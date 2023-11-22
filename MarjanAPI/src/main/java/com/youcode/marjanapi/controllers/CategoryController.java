package com.youcode.marjanapi.controllers;


import com.youcode.marjanapi.dtos.CategoryDto;
import com.youcode.marjanapi.models.Category;
import com.youcode.marjanapi.services.CrudService;
import com.youcode.marjanapi.services.implementation.CategoryServiceImp;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private final CrudService<Category> service;
    private final ModelMapper modelMapper;

    @Autowired
    public CategoryController(CategoryServiceImp categoryServiceImp, ModelMapper modelMapper) {
        this.service = categoryServiceImp;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<CategoryDto> readAll() {
        return service.readAll().stream()
                .map(category -> modelMapper.map(category, CategoryDto.class))
                .collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody CategoryDto categoryDto) {
        if(service.create(modelMapper.map(categoryDto, Category.class))) {
            return new ResponseEntity<>("category created successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("category creation failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}