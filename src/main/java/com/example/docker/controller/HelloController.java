package com.example.docker.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    @ApiOperation(value = "Check application if is Up")
    public String getAppUp() {
        return "Application is up and running!!!";
    }

    @GetMapping("/welcome")
    @ApiOperation(value = "Show welcome message")
    public String getWelcome() {
        return "Welcome to the DevOps culture!!!";
    }

}
