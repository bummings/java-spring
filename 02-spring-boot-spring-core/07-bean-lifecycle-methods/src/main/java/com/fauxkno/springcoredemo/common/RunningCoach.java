package com.fauxkno.springcoredemo.common;

import org.apache.catalina.User;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//Use the primary annotation as default when injected
// @Primary
public class RunningCoach implements Coach {
    public RunningCoach() {
        System.out.println("Comin to ya from: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "100 laps bruh";
    }
}
