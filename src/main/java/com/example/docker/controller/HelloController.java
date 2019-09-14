package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getAppUp() {
        return "Application is up and running!!!";
    }

    @GetMapping("/welcome")
    public String getWelcome() {
        return "Welcome to the DevOps culture!!!";
    }

}
