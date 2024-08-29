package com.fauxkno.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BreakdancingCoach implements Coach {
    public BreakdancingCoach() {
        System.out.println("Comin to ya from: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "flip it ninja";
    }
}
