package com.akshay.springboot.demo.demoApp.Rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class MainApplication {

    @RequestMapping("/")
    public String getHome(){
        return "Hello World!";
    }

    @RequestMapping("/workout")
    public String getWorkoutPlan(){
        return "Buddy, run 5 miles!";
    }
}
