package com.youcode.marjanapi.dtos.responses;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class CategoryRes {
    private UUID uuid;
    private String name;
}