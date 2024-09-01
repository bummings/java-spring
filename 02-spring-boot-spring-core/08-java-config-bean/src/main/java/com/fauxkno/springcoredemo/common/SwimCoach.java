package com.fauxkno.springcoredemo.common;

// notice no component annotation here
public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "no shoes in the pool bruh";
    }
}
