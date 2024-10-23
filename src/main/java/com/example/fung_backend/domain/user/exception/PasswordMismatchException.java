package com.example.fung_backend.domain.user.exception;

import com.example.fung_backend.global.error.exception.CustomException;
import com.example.fung_backend.global.error.exception.ErrorCode;

public class PasswordMismatchException extends CustomException {

    public static final PasswordMismatchException EXCEPTION = new PasswordMismatchException();

    private PasswordMismatchException() {
        super(ErrorCode.PASSWORD_MISMATCH);
    }
}
