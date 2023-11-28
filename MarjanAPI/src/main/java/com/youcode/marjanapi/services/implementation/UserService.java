package com.youcode.marjanapi.services.implementation;

import com.youcode.marjanapi.enums.Role;
import com.youcode.marjanapi.models.Administrator;
import com.youcode.marjanapi.models.GeneralAdministrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public UserDetails loadUserByUsername(String username) { // I should implement administrators authentication checking here
        System.out.println("User details service called");
        if(!username.equals("Mohamed")) throw new UsernameNotFoundException("User name not found");
        return new GeneralAdministrator("Mohamed", passwordEncoder.encode("password"), Role.GENERAL_ADMIN);
    }
}
