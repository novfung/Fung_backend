package com.example.fung_backend.domain.user.domain.repository;

import com.example.fung_backend.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Boolean existsByAccountId(String accountId);
    Optional<User> findByAccountId(String accountId);
}
