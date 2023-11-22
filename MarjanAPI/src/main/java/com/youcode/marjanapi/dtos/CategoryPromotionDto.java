package com.youcode.marjanapi.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class CategoryPromotionDto extends PromotionDto {
    @NotNull(message = "category field cannot be empty")
    @JsonIgnore
    private CategoryDto category;
}
