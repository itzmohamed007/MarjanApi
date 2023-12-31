package com.youcode.marjanapi.dtos.responses;

import lombok.Data;

import java.util.UUID;

@Data
public class ProductRes {
    private UUID uuid;
    private String name;
    private String brand;
    private float price;
}
