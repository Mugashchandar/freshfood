package com.mugash.freshfood.controller;

import com.mugash.freshfood.entity.User;
import com.mugash.freshfood.repository.AddressRepository;
import com.mugash.freshfood.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FreshfoodController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private AddressRepository addressRepo;

    @GetMapping(path="/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/users")
    public List<User> retrieveAllUser() {
        return userRepo.findAll();
    }

    @PostMapping("/registerUser")
    public void registerUser(@RequestBody User user) {
        userRepo.save(user);
    }

}
