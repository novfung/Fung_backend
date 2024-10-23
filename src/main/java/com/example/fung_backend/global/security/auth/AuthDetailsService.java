package com.example.fung_backend.global.security.auth;

import com.example.fung_backend.domain.user.domain.User;
import com.example.fung_backend.domain.user.domain.repository.UserRepository;
import com.example.fung_backend.domain.user.exception.UserNotFondException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String accountId) {

        User user =userRepository.findByAccountId(accountId)
                .orElseThrow(()-> UserNotFondException.EXCEPTION);

        return new AuthDetails(user.getAccountId());
    }
}
