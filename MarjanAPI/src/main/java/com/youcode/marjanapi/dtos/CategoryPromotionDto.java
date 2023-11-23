package com.youcode.marjanapi.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
public class CategoryPromotionDto extends PromotionDto {
    @NotNull(message = "category field cannot be empty")
    private CategoryDto category;
}