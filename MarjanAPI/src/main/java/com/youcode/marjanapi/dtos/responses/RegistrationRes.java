package com.youcode.marjanapi.dtos.responses;

import com.youcode.marjanapi.enums.Role;
import lombok.Data;

@Data
public class RegistrationRes {
    private String email;
    private Role role;
}
