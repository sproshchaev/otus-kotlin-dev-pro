package com.prosoft.java.repository;

import com.prosoft.java.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1L, "User1", "user1@java.com"));
        users.add(new User(2L, "User2", "user2@java.com"));
        users.add(new User(3L, "User3", "user3@java.com"));
    }

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public void save(User user) {
        users.add(user);
    }

    public void deleteById(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }

}
