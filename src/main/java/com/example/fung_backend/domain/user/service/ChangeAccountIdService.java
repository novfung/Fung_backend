package com.example.fung_backend.domain.user.service;

import com.example.fung_backend.domain.user.domain.User;
import com.example.fung_backend.domain.user.domain.repository.UserRepository;
import com.example.fung_backend.domain.user.facade.UserFacade;
import com.example.fung_backend.domain.user.presentation.dto.request.ChangeAccountIdRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChangeAccountIdService {

    private final UserRepository userRepository;
    private final UserFacade userFacade;

    public void updateAccountId(ChangeAccountIdRequest request) {
        User user = userFacade.getCurrentUser();
        user.updateAccountId(request.getAccountId());

        userRepository.save(user);
    }
}
