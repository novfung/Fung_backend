package com.example.fung_backend.domain.user.service;

import com.example.fung_backend.domain.user.domain.User;
import com.example.fung_backend.domain.user.domain.repository.UserRepository;
import com.example.fung_backend.domain.user.exception.UserAlreadyExistException;
import com.example.fung_backend.domain.user.presentation.dto.request.UserSignUpRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Getter
@RequiredArgsConstructor
public class UserSignUpService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void execute(UserSignUpRequest request) {
        if (userRepository.existsByAccountId(request.getAccountId())) {
            throw UserAlreadyExistException.EXCEPTION;
        }

        userRepository.save(User.builder()
                .accountId(request.getAccountId())
                .password(passwordEncoder.encode(request.getPassword()))
                .build());
    }
}
