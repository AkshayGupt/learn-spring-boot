package com.demo.springcoredemo.rest;

import com.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    //Setter Injection
    @Autowired
    private void setMyCoach(Coach myCoach){
        this.myCoach = myCoach;
    }

    // Can assign any name to the function
//    @Autowired
//    private void calculateWorkoutUsingCoach(Coach myCoach){
//        this.myCoach = myCoach;
//    }

    @GetMapping({"/", "/dailyWorkout"})
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
   }

}
