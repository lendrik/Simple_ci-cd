package com.example.simple_cicd.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/status")
    public String getStatus(){
        return "It's OK";
    }
}
