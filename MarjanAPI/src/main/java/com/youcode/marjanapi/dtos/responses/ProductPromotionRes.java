package com.youcode.marjanapi.dtos.responses;

import com.youcode.marjanapi.dtos.PromotionDto;
import lombok.Data;

@Data
public class ProductPromotionRes extends PromotionRes {
    private ProductRes product;
}
