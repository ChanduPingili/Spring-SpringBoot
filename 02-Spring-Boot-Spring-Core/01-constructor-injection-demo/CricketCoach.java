package com.springcore.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Run daily atleast 15 mins";
    }

}
