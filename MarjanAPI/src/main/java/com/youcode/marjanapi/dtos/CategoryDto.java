package com.youcode.marjanapi.dtos;

import com.youcode.marjanapi.models.CategoryPromotion;
import com.youcode.marjanapi.models.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public class CategoryDto {
    private UUID uuid;
    private String name;
    private CategoryPromotion categoryPromotion;
    private List<Product> products;
}
