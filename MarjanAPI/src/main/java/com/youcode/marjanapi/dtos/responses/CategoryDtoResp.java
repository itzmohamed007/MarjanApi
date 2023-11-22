package com.youcode.marjanapi.dtos.responses;

import com.youcode.marjanapi.dtos.CategoryPromotionDto;
import com.youcode.marjanapi.dtos.ProductDto;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class CategoryDtoResp {
    private UUID uuid;
    private String name;
    private CategoryPromotionDto categoryPromotions;
    private List<ProductDto> products;
}
