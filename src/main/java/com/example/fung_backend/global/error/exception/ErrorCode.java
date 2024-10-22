package com.example.fung_backend.global.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    PASSWORD_MISMATCH(401, "Password Mismatch"),
    EXPIRED_JWT(401, "Expired Jwt"),
    INVALID_JWT(401, "Invalid Jwt"),

    USER_NOT_FOUND(404, "User Not Found"),

    USER_ALREADY_EXIST(409, "User Already Exist"),

    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int status;
    private final String message;
}
