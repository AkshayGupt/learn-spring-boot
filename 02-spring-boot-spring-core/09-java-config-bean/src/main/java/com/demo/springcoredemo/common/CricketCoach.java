package com.demo.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy  //Instead of adding it into every component: adding in the application.properties
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("Inside constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Fast bowling for 10 minutes";
    }
}
