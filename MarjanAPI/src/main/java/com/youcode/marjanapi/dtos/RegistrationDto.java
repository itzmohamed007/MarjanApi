package com.youcode.marjanapi.dtos;

import com.youcode.marjanapi.enums.Role;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegistrationDto {
    @NotNull(message = "email cannot be empty")
    private String email;
    @NotNull(message = "password cannot be empty")
    private String password;
    @NotNull(message = "role cannot be empty")
    private Role role;
}
