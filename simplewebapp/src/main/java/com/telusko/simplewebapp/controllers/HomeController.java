package com.telusko.simplewebapp.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
;


@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String greet(){
        return "Welcome to Spring Boot";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is about Page";
    }
    
    
}
