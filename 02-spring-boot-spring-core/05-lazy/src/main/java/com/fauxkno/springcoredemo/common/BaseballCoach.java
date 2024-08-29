package com.fauxkno.springcoredemo.common;

import org.springframework.stereotype.Component;


@Component
public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("Comin to ya from: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "hit that thang";
    }
}
