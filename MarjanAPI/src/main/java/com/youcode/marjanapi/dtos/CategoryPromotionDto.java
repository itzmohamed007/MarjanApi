package com.youcode.marjanapi.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CategoryPromotionDto extends PromotionDto {
    private CategoryDto category;
}