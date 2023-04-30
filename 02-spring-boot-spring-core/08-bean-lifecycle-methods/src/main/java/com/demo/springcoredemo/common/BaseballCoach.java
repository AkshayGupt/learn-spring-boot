package com.demo.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("Inside constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice baseball for 40 mins";
    }

    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("In postconstruct"+ getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In predestroy: "+ getClass().getSimpleName());
    }


}
