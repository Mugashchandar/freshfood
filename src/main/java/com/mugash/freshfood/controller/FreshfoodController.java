package com.mugash.freshfood.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreshfoodController {

    @GetMapping(path="/hello")
    public String helloWorld() {
        return "Hello World";
    }

}