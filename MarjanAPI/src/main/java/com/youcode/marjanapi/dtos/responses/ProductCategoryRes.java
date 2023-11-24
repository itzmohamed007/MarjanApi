package com.youcode.marjanapi.dtos.responses;

import lombok.Data;

import java.util.UUID;

@Data
public class ProductCategoryRes {
    private UUID uuid;
    private String name;
    private String brand;
    private float price;
    private CategoryRes category;
}
