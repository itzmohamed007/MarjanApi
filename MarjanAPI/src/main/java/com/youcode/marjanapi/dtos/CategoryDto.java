package com.youcode.marjanapi.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public class CategoryDto {
    private UUID uuid;
    @NotNull(message = "category name field should not be blank")
    private String name;
    @JsonBackReference
    private CategoryPromotionDto categoryPromotions;
    private List<ProductDto> products;
}
