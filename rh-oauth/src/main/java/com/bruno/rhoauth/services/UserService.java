package com.bruno.rhoauth.services;

import com.bruno.rhoauth.entities.User;
import com.bruno.rhoauth.feignclients.UserClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService implements UserDetailsService {

    private final UserClient userClient;

    public User findByEmail(String email) {
        var user = userClient.findByEmail(email).getBody();
        if (user == null) {
            log.error("Email não encontrado: {}", email);
            throw new IllegalArgumentException("Email não encontrado.");
        }
        log.info("Email encontrado: {}", email);
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        var user = userClient.findByEmail(username).getBody();
        if (user == null) {
            log.error("Email não encontrado: {}", username);
            throw new UsernameNotFoundException("Email não encontrado.");
        }
        log.info("Email encontrado: {}", username);
        return user;
    }
}
