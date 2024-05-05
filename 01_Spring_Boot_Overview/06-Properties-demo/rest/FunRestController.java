package com.spring.practice.practice1.practice1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Expose "/" that return Hello world
    @Value("${team.name}")
    private String teamName;

    @Value("${coach.name}")
    private String coachName;
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    // Expose "/Coding" that return Hard Code for 3Hrs
    @GetMapping("/Coding")
    public String getDailyCode(){
        return "Hard Code for 3Hrs";
    }

    @GetMapping("/Learn")
    public String getDailyLearning(){
        return "Learn for 2Hrs";
    }

    @GetMapping("/teamInfo")
    public String getTeamInfo(){
        return "Coach : "+coachName+" , Team : "+teamName;
    }
}
