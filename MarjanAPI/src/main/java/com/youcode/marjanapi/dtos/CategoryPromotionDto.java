package com.youcode.marjanapi.dtos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.youcode.marjanapi.models.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class CategoryPromotionDto extends PromotionDto {
    @NotNull(message = "category field cannot be empty")
    @JsonManagedReference
    private CategoryDto category;
}
