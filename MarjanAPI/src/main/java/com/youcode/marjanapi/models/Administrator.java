    package com.youcode.marjanapi.models;

    import com.youcode.marjanapi.enums.Role;
    import jakarta.persistence.*;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    import java.util.UUID;

    @Data
    @MappedSuperclass
    public abstract class Administrator {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID uuid;
        private String email;
        private String password;
        @Enumerated(EnumType.STRING)
        private Role role;
    }
