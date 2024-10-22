package com.example.fung_backend.domain.user.facade;

import com.example.fung_backend.domain.user.domain.User;
import com.example.fung_backend.domain.user.domain.repository.UserRepository;
import com.example.fung_backend.domain.user.exception.UserNotFondException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFacade {

    private final UserRepository userRepository;

    public User getCurrentUser() {
        String accountId = SecurityContextHolder.getContext().getAuthentication().getName();
        return getUserByAccountId(accountId);
    }

    public User getUserByAccountId(String accountId) {
        return userRepository.findByAccountId(accountId)
                .orElseThrow(()-> UserNotFondException.EXCEPTION);
    }
}
