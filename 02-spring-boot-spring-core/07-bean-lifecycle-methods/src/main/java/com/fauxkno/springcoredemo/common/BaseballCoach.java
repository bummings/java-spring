package com.fauxkno.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component

public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("Comin to ya from: " + getClass().getSimpleName());
    }

    // define init method
    @PostConstruct
    public void doStartupStuff() {
        System.out.println("In doStartupStuff()");
    }

    // deine destroy method
    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("In doCleanupStuff()");
    }

    @Override
    public String getDailyWorkout() {
        return "hit that thang";
    }
}
