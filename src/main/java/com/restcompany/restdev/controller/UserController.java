package com.restcompany.restdev.controller;

import com.restcompany.restdev.entity.User;
import com.restcompany.restdev.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAll(){
        return userRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable ObjectId id) {

        return userRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<?> save(@RequestBody User user){
        userRepository.save(user);
        return ResponseEntity.ok().build();
    }

}
