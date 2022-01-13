package com.mugash.freshfood.controller;

import com.mugash.freshfood.entity.User;
import com.mugash.freshfood.repository.AddressRepository;
import com.mugash.freshfood.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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
        addressRepo.save(user.getAddress());
        userRepo.save(user);
    }

}
