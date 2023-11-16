package com.youcode.marjanapi.dtos;

import com.youcode.marjanapi.models.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductPromotionDto extends ProductDto{
    private Product product;
}
