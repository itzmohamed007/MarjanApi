package com.youcode.marjanapi.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductPromotionDto extends PromotionDto {
    @NotNull(message = "product cannot be null")
    private ProductDto product;
}
