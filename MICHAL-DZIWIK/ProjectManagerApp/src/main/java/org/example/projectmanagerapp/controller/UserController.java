// File: UserController.java
package org.example.projectmanagerapp.controller;

import org.example.projectmanagerapp.entity.User;
import org.example.projectmanagerapp.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Metoda GET do pobierania wszystkich użytkowników
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Metoda POST do tworzenia nowego użytkownika
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}