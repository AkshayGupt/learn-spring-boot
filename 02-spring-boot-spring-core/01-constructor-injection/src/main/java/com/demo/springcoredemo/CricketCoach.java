package com.demo.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Fast bowling for 10 minutes";
    }
}
