package com.example.fung_backend.global.security.jwt;

import com.example.fung_backend.global.error.exception.CustomException;
import com.example.fung_backend.global.error.exception.ErrorCode;

public class ExpiredJwtException extends CustomException {

    public static final ExpiredJwtException EXCEPTION = new ExpiredJwtException();

    private ExpiredJwtException() {
        super(ErrorCode.EXPIRED_JWT);
    }
}
