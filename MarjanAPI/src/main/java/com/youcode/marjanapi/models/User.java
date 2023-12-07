    package com.youcode.marjanapi.models;

    import com.youcode.marjanapi.enums.Role;
    import jakarta.persistence.*;
    import lombok.Data;
    import org.springframework.security.core.GrantedAuthority;
    import org.springframework.security.core.authority.SimpleGrantedAuthority;
    import org.springframework.security.core.userdetails.UserDetails;

    import java.util.Collection;
    import java.util.Collections;
    import java.util.Set;
    import java.util.UUID;
    import java.util.stream.Collectors;

    @Data
    @Entity
    @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
    @Table(name = "users")
    public class User implements UserDetails {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID uuid;
        @Column(unique = true)
        private String email;
        private String password;
        @Column(nullable = false)
        @Enumerated(EnumType.STRING)
        private Role role;

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return Collections.singleton(new SimpleGrantedAuthority(role.name())); // parsing the single role entity into a singleton list
        }

        @Override
        public String getUsername() {
            return getEmail();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }
