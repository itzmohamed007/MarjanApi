package com.youcode.marjanapi.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class ProductDto {
    private UUID uuid;
    @NotNull(message = "product name cannot be empty")
    private String name;
    @NotNull(message = "brand name cannot be empty")
    private String brand;
    @NotNull(message = "price cannot be empty")
    @Digits(integer = 4, fraction = 2, message = "Invalid price format")
    private Float price;
    private CategoryDto category;
    private ProductPromotionDto productPromotion;
}
