package com.youcode.marjanapi.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonIgnore
    private CategoryPromotionDto categoryPromotions;
    private List<ProductDto> products;
}
