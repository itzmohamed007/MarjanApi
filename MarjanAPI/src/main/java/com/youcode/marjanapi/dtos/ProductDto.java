package com.youcode.marjanapi.dtos;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Data
@NoArgsConstructor
@Validated
public class ProductDto {
    private UUID uuid;
    @NotNull(message = "product name cannot be empty")
    private String name;
    @NotNull(message = "brand name cannot be empty")
    private String brand;
    @NotNull(message = "price cannot be empty")
    @Digits(integer = 4, fraction = 2, message = "Invalid price format")
    private Float price;
    @NotNull(message = "category cannot be empty")
    private CategoryDto category;
    private ProductPromotionDto productPromotion;
}
