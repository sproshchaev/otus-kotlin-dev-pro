package com.prosoft.java.service;

import com.prosoft.java.domain.User;
import com.prosoft.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser(Long id) {
        return Optional.ofNullable(id)
                .flatMap(userRepository::findById)
                .map(Collections::singletonList)
                .orElse(Collections.emptyList());
    }

}
