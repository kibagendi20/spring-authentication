package com.security.authentication.repository;

import com.security.authentication.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User, String> {
    public Optional<User> findByEmail(String email);
}
