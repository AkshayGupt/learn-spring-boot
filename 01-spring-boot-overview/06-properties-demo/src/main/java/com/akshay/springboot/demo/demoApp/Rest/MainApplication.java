package com.akshay.springboot.demo.demoApp.Rest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class MainApplication {
    // Injecting properties coach.name & team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // Endpoints
    @RequestMapping("/")
    public String getHome(){
        return "Hello World!";
    }

    @RequestMapping("/workout")
    public String getWorkoutPlan(){
        return "Buddy, run 5 miles!";
    }

    @RequestMapping("/team")
    public String getTeamInfo(){
        return "Coach: "+coachName+"\n Team: "+teamName;
    }



}
