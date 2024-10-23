package com.example.fung_backend.domain.user.exception;

import com.example.fung_backend.global.error.exception.CustomException;
import com.example.fung_backend.global.error.exception.ErrorCode;

public class UserNotFondException extends CustomException {

    public static final UserNotFondException EXCEPTION = new UserNotFondException();

    private UserNotFondException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
