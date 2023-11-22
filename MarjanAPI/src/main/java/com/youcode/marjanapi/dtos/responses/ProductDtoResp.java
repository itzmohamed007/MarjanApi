package com.youcode.marjanapi.dtos.responses;

import com.youcode.marjanapi.dtos.CategoryDto;
import com.youcode.marjanapi.dtos.ProductPromotionDto;
import lombok.Data;

import java.util.UUID;

@Data
public class ProductDtoResp {
    private UUID uuid;
    private String name;
    private String brand;
    private float price;
    private CategoryDto category;
    private ProductPromotionDto productPromotion;
}
