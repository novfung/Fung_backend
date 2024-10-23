package com.example.fung_backend.domain.user.exception;

import com.example.fung_backend.global.error.exception.CustomException;
import com.example.fung_backend.global.error.exception.ErrorCode;
import lombok.Getter;

public class UserAlreadyExistException extends CustomException {

    public static final UserAlreadyExistException EXCEPTION = new UserAlreadyExistException();

    private UserAlreadyExistException() {
        super(ErrorCode.USER_ALREADY_EXIST);
    }
}
