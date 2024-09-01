package com.fauxkno.springcoredemo.config;

import com.fauxkno.springcoredemo.common.Coach;
import com.fauxkno.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // the bean id defaults to the method name
    @Bean("aquatic")  // using a custom id instead of default
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
