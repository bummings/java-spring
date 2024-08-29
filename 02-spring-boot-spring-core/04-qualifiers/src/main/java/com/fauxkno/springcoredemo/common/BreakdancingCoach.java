package com.fauxkno.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BreakdancingCoach implements Coach {
    public String getDailyWorkout() {
        return "flip it ninja";
    }
}
