package com.springcore.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component //it makes class and java bean , and identified during program execution for autowired
public class BaseballCoach implements Coach{

    public String getDailyWorkout(){
        return "Practice Batting daily for 30 minutes ";
    }
}
