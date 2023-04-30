package com.demo.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("Inside constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim daily for 45 minutes";
    }
}
