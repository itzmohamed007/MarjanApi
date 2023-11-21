package com.youcode.marjanapi.dtos;

import com.youcode.marjanapi.models.Category;
import com.youcode.marjanapi.models.ProductPromotion;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;

import java.util.UUID;

@Data
@NoArgsConstructor
public class ProductDto {
    private UUID uuid;
    @NotNull(message = "product name cannot be empty")
    private String name;
    @NotNull(message = "brand name cannot be empty")
    private String brand;
    @Min(value = 0, message = "Price must be greater than or equal to 0")
    private float price;
    private ProductPromotionDto productPromotion;
    private CategoryDto category;
}
