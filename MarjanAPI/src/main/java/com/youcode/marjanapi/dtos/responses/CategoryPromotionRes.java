package com.youcode.marjanapi.dtos.responses;

import com.youcode.marjanapi.dtos.PromotionDto;
import lombok.Data;

@Data
public class CategoryPromotionRes extends PromotionRes {
    private CategoryRes category;
}
