package com.youcode.marjanapi.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

public abstract class PromotionDto {
    private UUID uuid;
    private float percentage;
}
