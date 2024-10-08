package com.fauxkno.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("Comin to ya from: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "hit that thang";
    }
}
