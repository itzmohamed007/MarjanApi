package com.youcode.marjanapi.dtos.responses;

import lombok.Data;

@Data
public class CategoryPromotionRes extends PromotionRes {
    private CategoryRes category;
}
