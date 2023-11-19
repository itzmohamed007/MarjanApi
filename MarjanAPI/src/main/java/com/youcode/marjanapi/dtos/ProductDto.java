package com.youcode.marjanapi.dtos;

import com.youcode.marjanapi.models.Category;
import com.youcode.marjanapi.models.ProductPromotion;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class ProductDto {
    private UUID uuid;
    @NotBlank(message = "product name should not be blank")
    private String name;
    @NotBlank(message = "brand name should not be blank")
    private String brand;
    @NotBlank(message = "price should not be blank")
    @Min(0)
    private float price;
    private ProductPromotionDto productPromotion;
    private CategoryDto category;
}
