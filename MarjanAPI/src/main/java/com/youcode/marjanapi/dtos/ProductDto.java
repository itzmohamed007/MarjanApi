package com.youcode.marjanapi.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Data
@NoArgsConstructor
@ToString
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
    @JsonIgnore
    @NotNull(message = "category cannot be empty")
    private CategoryDto category;
    @JsonIgnore
    private ProductPromotionDto productPromotion;
}
