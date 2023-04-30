package com.demo.springcoredemo.rest;

import com.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Lazy;

@RestController
public class DemoController {

    private Coach coach1;

    public DemoController(){
        System.out.println("Inside constructor: "+getClass().getSimpleName());
    }

    //Setter Injection
    @Autowired
    private void setMyCoach(@Qualifier("baseballCoach") Coach coach1,
                            @Qualifier("baseballCoach") Coach coach2){
        this.coach1 = coach1;
    }


    @GetMapping({"/", "/dailyWorkout"})
    public String getDailyWorkout(){
        return coach1.getDailyWorkout();
   }

}
