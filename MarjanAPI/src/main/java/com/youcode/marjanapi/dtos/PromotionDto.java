package com.youcode.marjanapi.dtos;

import com.youcode.marjanapi.enums.PromotionStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
@Data
public abstract class PromotionDto {
    private UUID uuid;
    @NotNull(message = "percentage field cannot be empty")
    private Float percentage;
    @NotNull(message = "status field cannot be null")
    private PromotionStatus status;
}
