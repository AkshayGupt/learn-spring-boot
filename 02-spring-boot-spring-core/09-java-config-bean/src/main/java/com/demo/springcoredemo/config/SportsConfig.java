package com.demo.springcoredemo.config;

import com.demo.springcoredemo.common.SwimCoach;
import com.demo.springcoredemo.common.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
