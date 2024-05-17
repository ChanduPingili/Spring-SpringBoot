package com.springcore.springcoredemo.rest;

import com.springcore.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    private Coach myCoach;
    private Coach myAnotherCoach;
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach,
                          @Qualifier("baseballCoach") Coach anotherCoach){
        System.out.println("In constructor : "+getClass().getSimpleName());
        myAnotherCoach = anotherCoach;
        myCoach = theCoach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check()
    {
        return ("Comparing myAnotherCoach == myCoach : "+(myAnotherCoach==myCoach));
    }
}