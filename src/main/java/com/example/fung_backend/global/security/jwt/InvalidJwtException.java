package com.example.fung_backend.global.security.jwt;

import com.example.fung_backend.global.error.exception.CustomException;
import com.example.fung_backend.global.error.exception.ErrorCode;

public class InvalidJwtException extends CustomException {

    public static final InvalidJwtException EXCEPTION = new InvalidJwtException();

    private InvalidJwtException() {
        super(ErrorCode.INVALID_JWT);
    }
}
