package com.youcode.marjanapi.dtos.responses;

import com.youcode.marjanapi.dtos.CategoryDto;
import com.youcode.marjanapi.dtos.PromotionDto;
import lombok.Data;

@Data
public class CategoryPromotionDtoResp extends PromotionDto {
    private CategoryDto category;
}