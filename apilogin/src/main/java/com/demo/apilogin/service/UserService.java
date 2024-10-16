package com.demo.apilogin.service;

import com.demo.apilogin.entity.UserEntity;
import com.demo.apilogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private static final String EXISING_EMAIL = "test@gmail.com";

    private static final String EXISING_EMAIL2 = "test2@gmail.com";

    @Autowired
    private UserRepository userRepository;

    public Optional<UserEntity> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
