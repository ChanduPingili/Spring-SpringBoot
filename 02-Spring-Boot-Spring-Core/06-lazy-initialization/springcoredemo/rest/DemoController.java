package com.springcore.springcoredemo.rest;

import com.springcore.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    private Coach myCoach;

    @Autowired //it is optional if we have only one constructor
//    public DemoController(Coach theCoach){  //instead of Qualifiers we can use Primary annotation in the Bean class intself
        //But Qualifier has higher priority
    public DemoController(@Qualifier("baseballCoach") Coach theCoach){
        System.out.println("In constructor : "+getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
