package com.demo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice baseball for 40 mins";
    }
}
