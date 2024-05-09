package com.springcore.springcoredemo.rest;

import com.springcore.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    private Coach myCoach;

//    @Autowired it is optional if we have only one constructor
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }
// above constructor is not needed for setter injection

    @Autowired
    public void setMyCoach(Coach myCoach){  //setter name can be anything
        this.myCoach = myCoach;
    }
    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
