package com.example.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${greeter.message}")
    private String greeterMessageFormat;
    
    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, World!";
    }
}
