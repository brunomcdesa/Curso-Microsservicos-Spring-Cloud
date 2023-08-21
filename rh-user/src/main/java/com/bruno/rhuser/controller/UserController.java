package com.bruno.rhuser.controller;

import com.bruno.rhuser.entities.User;
import com.bruno.rhuser.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository repository;

    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = repository.findById(id).get();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/search")
    public ResponseEntity<User> findById(@RequestParam String email) {
        var user = repository.findByEmail(email);
        return ResponseEntity.ok(user);
    }
}
