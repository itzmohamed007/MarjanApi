package com.youcode.marjanapi.models;

import com.youcode.marjanapi.enums.PromotionStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
@MappedSuperclass
public abstract class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private float percentage;
    @Enumerated(EnumType.STRING)
    private PromotionStatus status;
}
