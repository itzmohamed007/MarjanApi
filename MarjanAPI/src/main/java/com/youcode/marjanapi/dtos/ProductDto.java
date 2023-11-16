package com.youcode.marjanapi.dtos;

import com.youcode.marjanapi.models.Category;
import com.youcode.marjanapi.models.ProductPromotion;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class ProductDto {
    private UUID uuid;
    private String name;
    private String brand;
    private float price;
    private ProductPromotion productPromotion;
    private Category category;
}
