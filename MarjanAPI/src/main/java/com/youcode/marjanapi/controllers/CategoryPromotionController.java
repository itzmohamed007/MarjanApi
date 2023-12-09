package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.dtos.CategoryPromotionDto;
import com.youcode.marjanapi.dtos.responses.CategoryPromotionRes;
import com.youcode.marjanapi.models.CategoryPromotion;
import com.youcode.marjanapi.models.DepartmentUser;
import com.youcode.marjanapi.services.CategoryPromotionService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin("*")
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
        CategoryPromotion categoryPromotion = modelMapper.map(requestCategoryPromotion, CategoryPromotion.class);
        if(service.create(categoryPromotion)) {
            categoryPromotion.addObserver(new DepartmentUser());
            categoryPromotion.notifyObserver(); // notifying department admins
            return new ResponseEntity<>("category promotion created successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("category promotion creation failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<?> read(@PathVariable UUID uuid) {
        Optional<CategoryPromotion> categoryPromotion = service.read(uuid);
        if (categoryPromotion.isPresent()) {
            CategoryPromotionRes categoryPromotionRes = modelMapper.map(categoryPromotion.get(), CategoryPromotionRes.class);
            return new ResponseEntity<>(categoryPromotionRes, HttpStatus.OK);
        }
        return new ResponseEntity<>("No category promotion found", HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<?> readAll() {
        List<CategoryPromotionRes> categoryPromotions = service.readAll().stream()
                .map(categoryPromotion -> modelMapper.map(categoryPromotion, CategoryPromotionRes.class))
                .toList();
        if (categoryPromotions.isEmpty()) {
            return new ResponseEntity<>("No category promotions found", HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(categoryPromotions, HttpStatus.OK);
        }
    }

    @PutMapping("/{uuid}")
    public ResponseEntity<?> update(@PathVariable UUID uuid, @Valid @RequestBody CategoryPromotionDto requestCategoryPromotionDto) {
        if(requestCategoryPromotionDto.getUuid() == null)
            requestCategoryPromotionDto.setUuid(uuid);
        if(service.update(modelMapper.map(requestCategoryPromotionDto, CategoryPromotion.class))) {
            return new ResponseEntity<>("Category promotion updated successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("No category promotion found with uuid: " + uuid, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<?> delete(@PathVariable UUID uuid) {
        if(service.delete(uuid)) {
            return new ResponseEntity<>("Category promotion deleted successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("No category promotion found with uuid: " + uuid, HttpStatus.NOT_FOUND);
    }
}
