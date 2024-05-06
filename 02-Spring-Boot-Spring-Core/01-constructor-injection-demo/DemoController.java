package com.springcore.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    private Coach myCoach;

    @Autowired //it is optional if we have only one constructor
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
