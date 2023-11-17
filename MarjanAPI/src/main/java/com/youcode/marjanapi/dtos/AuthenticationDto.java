package com.youcode.marjanapi.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AuthenticationDto {
    private String email;
    private String password;
}
