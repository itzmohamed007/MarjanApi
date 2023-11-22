package com.youcode.marjanapi.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductPromotionDto extends PromotionDto{
    @JsonIgnore
    private ProductDto product;
}
