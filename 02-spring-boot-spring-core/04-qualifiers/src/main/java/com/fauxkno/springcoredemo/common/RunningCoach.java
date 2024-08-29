package com.fauxkno.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach{
    public String getDailyWorkout() {
        return "100 laps bruh";
    }
}
