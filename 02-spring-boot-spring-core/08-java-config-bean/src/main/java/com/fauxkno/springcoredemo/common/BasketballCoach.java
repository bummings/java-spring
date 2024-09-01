package com.fauxkno.springcoredemo.common;
import org.springframework.stereotype.Component;

// FYI this Component annotation marks the class as a Spring bean for injections

@Component
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("Comin to ya from: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "20 jumpshots!!!";
    }
}
