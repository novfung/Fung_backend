package com.example.fung_backend.domain.user.service;

import com.example.fung_backend.domain.user.domain.User;
import com.example.fung_backend.domain.user.domain.repository.UserRepository;
import com.example.fung_backend.domain.user.facade.UserFacade;
import com.example.fung_backend.domain.user.presentation.dto.request.ChangePasswordRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChangePasswordService {

    private final UserRepository userRepository;
    private final UserFacade userFacade;
    private final PasswordEncoder passwordEncoder;

    public void updatePassword(ChangePasswordRequest request) {
        User user = userFacade.getCurrentUser();
        user.updatePassword(passwordEncoder.encode(request.getPassword()));

        userRepository.save(user);
    }
}
