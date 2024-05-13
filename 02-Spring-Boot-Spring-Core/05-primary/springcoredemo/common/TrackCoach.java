package com.springcore.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //it makes class and java bean , and identified during program execution for autowired
@Primary  // used for autowiring(constructor injection) when there are multiple classes that implementing same interface
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice running daily for 30 minutes ";
    }
}
