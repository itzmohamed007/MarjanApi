    package com.youcode.marjanapi.models;

    import com.youcode.marjanapi.enums.Role;
    import jakarta.persistence.*;
    import lombok.Data;

    import java.util.UUID;

    @Data
    @MappedSuperclass
    public abstract class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID uuid;
        private String email;
        private String password;
        @Enumerated(EnumType.STRING)
        private Role role;
    }
