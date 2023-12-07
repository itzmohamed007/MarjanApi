package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.enums.Role;
import com.youcode.marjanapi.models.User;
import com.youcode.marjanapi.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return repository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("user not found"));
    }

    public User register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); // hashing old plain password
        try {
            repository.save(user);
            return user;
        } catch (Exception e) {
            System.out.println("something went wrong while inserting new user");
            return null;
        }
    }
}
