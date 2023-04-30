package com.demo.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy  //Instead of adding it into every component: adding in the application.properties
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("Inside constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice baseball for 40 mins";
    }
}
