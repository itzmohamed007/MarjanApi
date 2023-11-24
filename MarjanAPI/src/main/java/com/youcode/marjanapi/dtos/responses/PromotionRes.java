package com.youcode.marjanapi.dtos.responses;

import com.youcode.marjanapi.enums.PromotionStatus;
import lombok.Data;

import java.util.UUID;
@Data

public abstract class PromotionRes {
    private UUID uuid;
    private Float percentage;
    private PromotionStatus status;
}
