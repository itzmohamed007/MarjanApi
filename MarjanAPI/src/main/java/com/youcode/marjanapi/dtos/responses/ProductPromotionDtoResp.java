package com.youcode.marjanapi.dtos.responses;

import com.youcode.marjanapi.dtos.ProductDto;
import com.youcode.marjanapi.dtos.PromotionDto;
import lombok.Data;

@Data
public class ProductPromotionDtoResp extends PromotionDto {
    private ProductDto product;

}
