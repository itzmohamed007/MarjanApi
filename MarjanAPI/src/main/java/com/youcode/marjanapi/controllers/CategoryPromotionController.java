package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.dtos.CategoryDto;
import com.youcode.marjanapi.dtos.CategoryPromotionDto;
import com.youcode.marjanapi.models.Category;
import com.youcode.marjanapi.models.CategoryPromotion;
import com.youcode.marjanapi.services.CategoryPromotionService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/categories/promotions")
public class CategoryPromotionController {
    private final CategoryPromotionService service;
    private final ModelMapper modelMapper;

    @Autowired
    public CategoryPromotionController(@Qualifier("categoryPromotionServiceImp") CategoryPromotionService categoryPromotionService, ModelMapper modelMapper) {
        this.service = categoryPromotionService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody CategoryPromotionDto requestCategoryPromotion) {
        if(service.create(modelMapper.map(requestCategoryPromotion, CategoryPromotion.class))) {
            return new ResponseEntity<>("category promotion created successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("category promotion creation failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<?> read(@PathVariable UUID uuid) {
        Optional<CategoryPromotion> categoryPromotion = service.read(uuid);
        if (categoryPromotion.isPresent()) {
//            CategoryPromotionDto categoryPromotionDto = modelMapper.map(categoryPromotion, CategoryPromotionDto.class);
//            return new ResponseEntity<>(modelMapper.map(categoryPromotion, CategoryPromotionDto.class), HttpStatus.FOUND);
            return new ResponseEntity<>(categoryPromotion, HttpStatus.FOUND);
        }
        return new ResponseEntity<>("No category promotion found", HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<?> readAll() {
        List<CategoryPromotionDto> categoryPromotions = service.readAll().stream()
                .map(categoryPromotion -> modelMapper.map(categoryPromotion, CategoryPromotionDto.class))
                .toList();
        if (categoryPromotions.isEmpty()) {
            return new ResponseEntity<>("No category promotions found", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(categoryPromotions, HttpStatus.FOUND);
        }
    }

    @PutMapping("/{uuid}")
    public ResponseEntity<?> update(@PathVariable UUID uuid, @Valid @RequestBody CategoryPromotionDto requestCategoryPromotionDto) {
        if(requestCategoryPromotionDto.getUuid() == null) {
            requestCategoryPromotionDto.setUuid(uuid);
        }
        if(service.update(modelMapper.map(requestCategoryPromotionDto, CategoryPromotion.class))) {
            return new ResponseEntity<>("Category promotion updated successfully", HttpStatus.FOUND);
        }
        return new ResponseEntity<>("No category promotions found with uuid: " + uuid, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<?> delete(@PathVariable UUID uuid) {
        if(service.delete(uuid)) {
            return new ResponseEntity<>("Category promotion deleted successfully", HttpStatus.FOUND);
        }
        return new ResponseEntity<>("No category promotion found with uuid: " + uuid, HttpStatus.NOT_FOUND);
    }
}
