package com.fauxkno.springcoredemo.common;

import org.springframework.stereotype.Component;


public BaseballCoach() {
    System.out.println("In component: " + getClass().getSimpleName());
}

@Component
public class BaseballCoach implements Coach {
    public String getDailyWorkout() {
        return "hit that thang";
    }
}
