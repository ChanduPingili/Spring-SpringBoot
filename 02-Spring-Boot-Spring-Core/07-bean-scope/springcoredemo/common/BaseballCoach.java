package com.springcore.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //prototype creates seperate instance for every call
//singleton creates single instance for every call, by default it is singleton
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Practice Batting daily for 30 minutes ";
    }
}
