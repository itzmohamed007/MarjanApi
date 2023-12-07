package com.youcode.marjanapi.dtos.responses;

import lombok.Data;

@Data
public class ProductPromotionRes extends PromotionRes {
    private ProductRes product;
}
