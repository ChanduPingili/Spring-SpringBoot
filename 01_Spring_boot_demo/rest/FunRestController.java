package com.spring.practice.practice1.practice1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Expose "/" that return Hello world
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
}
