package com.youcode.marjanapi.dtos;

import com.youcode.marjanapi.models.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryPromotionDto extends PromotionDto {
    private Category category;
}
