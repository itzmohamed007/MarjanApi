package com.youcode.marjanapi.controllers;

import com.youcode.marjanapi.dtos.CategoryPromotionDto;
import com.youcode.marjanapi.dtos.ProductPromotionDto;
import com.youcode.marjanapi.dtos.responses.CategoryPromotionRes;
import com.youcode.marjanapi.dtos.responses.ProductPromotionRes;
import com.youcode.marjanapi.models.CategoryPromotion;
import com.youcode.marjanapi.models.ProductPromotion;
import com.youcode.marjanapi.services.ProductPromotionService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/products/promotions")
public class ProductPromotionController {
    private final ProductPromotionService service;
    private final ModelMapper modelMapper;

    @Autowired
    public ProductPromotionController(ProductPromotionService productPromotionService, ModelMapper modelMapper) {
        this.service = productPromotionService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody ProductPromotionDto productPromotionDto) {
        ProductPromotion productPromotion = modelMapper.map(productPromotionDto, ProductPromotion.class);
        if(service.create(productPromotion)) {
            return new ResponseEntity<>("Product promotion created successfully", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Product promotion creation failed", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<?> read(@PathVariable UUID uuid) {
        Optional<ProductPromotion> productPromotion = service.read(uuid);
        if (productPromotion.isPresent()) {
            ProductPromotionRes productPromotionDto = modelMapper.map(productPromotion.get(), ProductPromotionRes.class);
            return new ResponseEntity<>(productPromotionDto, HttpStatus.OK);
        }
        return new ResponseEntity<>("No product promotion found", HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<?> readAll() {
        List<ProductPromotionRes> productPromotions = service.readAll().stream()
                .map(productPromotion -> modelMapper.map(productPromotion, ProductPromotionRes.class))
                .collect(Collectors.toList());
        if(productPromotions.isEmpty()) {
            return new ResponseEntity<>("No product promotions found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productPromotions, HttpStatus.OK);
    }

    @PutMapping("/{uuid}")
    public ResponseEntity<?> update(@PathVariable UUID uuid, @Valid @RequestBody ProductPromotionDto requestproductPromotionDto) {
        if(requestproductPromotionDto.getUuid() == null)
            requestproductPromotionDto.setUuid(uuid);
        if(service.update(modelMapper.map(requestproductPromotionDto, ProductPromotion.class))) {
            return new ResponseEntity<>("Product promotion updated successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("No product promotion found with uuid: " + uuid, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<?> delete(@PathVariable UUID uuid) {
        if(service.delete(uuid)) {
            return new ResponseEntity<>("Product promotion deleted successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("No product promotion found with uuid: " + uuid, HttpStatus.NOT_FOUND);
    }
}
