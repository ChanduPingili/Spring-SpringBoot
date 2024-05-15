package com.springcore.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component //it makes class and java bean , and identified during program execution for autowired
//@Lazy this annotation is used to init class only when there is need of it
//it can be done glabally in properties file
//first baseballcoach is called than democontroller will be called
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Practice Batting daily for 30 minutes ";
    }
}
