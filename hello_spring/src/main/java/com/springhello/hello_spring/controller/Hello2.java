package com.springhello.hello_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2 {
    
    @GetMapping(value="/")
    public String hello () {
        return "Da o meu melhor, aprender Springboot";
    }




}
