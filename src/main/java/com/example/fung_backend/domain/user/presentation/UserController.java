package com.example.fung_backend.domain.user.presentation;

import com.example.fung_backend.domain.auth.presentation.dto.TokenResponse;
import com.example.fung_backend.domain.user.presentation.dto.request.ChangeAccountIdRequest;
import com.example.fung_backend.domain.user.presentation.dto.request.ChangePasswordRequest;
import com.example.fung_backend.domain.user.presentation.dto.request.UserSignInRequest;
import com.example.fung_backend.domain.user.presentation.dto.request.UserSignUpRequest;
import com.example.fung_backend.domain.user.service.ChangeAccountIdService;
import com.example.fung_backend.domain.user.service.ChangePasswordService;
import com.example.fung_backend.domain.user.service.UserSignInService;
import com.example.fung_backend.domain.user.service.UserSignUpService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserSignUpService userSignUpService;
    private final UserSignInService userSignInService;
    private final ChangePasswordService changePasswordService;
    private final ChangeAccountIdService changeAccountIdService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/signup")
    public void signUp(@RequestBody @Valid UserSignUpRequest request){
        userSignUpService.execute(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/signin")
    public TokenResponse signIn(@RequestBody @Valid UserSignInRequest request) {
        return userSignInService.signIn(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/password")
    public void changePassword(@RequestBody @Valid ChangePasswordRequest request) {
        changePasswordService.updatePassword(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/accountid")
    public void changeAccountId(@RequestBody @Valid ChangeAccountIdRequest request) {
        System.out.println(request.getAccountId().toString());
        changeAccountIdService.updateAccountId(request);
    }
}
