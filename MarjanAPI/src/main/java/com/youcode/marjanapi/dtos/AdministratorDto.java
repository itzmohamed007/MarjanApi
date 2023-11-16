package com.youcode.marjanapi.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
public abstract class AdministratorDto {
    private UUID uuid;
    private String email;
    private String password;
}
