package com.demo.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(
        ConfigurableBeanFactory.SCOPE_PROTOTYPE
)
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("Inside constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice baseball for 40 mins";
    }
}
