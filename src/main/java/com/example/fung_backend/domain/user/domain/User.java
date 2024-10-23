package com.example.fung_backend.domain.user.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String accountId;

    @Column(nullable = false)
    private String password;

    @Builder
    private User(String accountId, String password) {
        this.accountId = accountId;
        this.password = password;
    }

    public void updatePassword (String password) {
        this.password = password;
    }

    public void updateAccountId(String accountId) {
        this.accountId = accountId;
    }
}
