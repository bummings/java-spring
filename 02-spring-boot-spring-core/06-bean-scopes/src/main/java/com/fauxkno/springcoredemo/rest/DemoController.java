package com.fauxkno.springcoredemo.rest;

import com.fauxkno.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;
    private Coach mySecondCoach;

//    //define a constructor for dependency injection
//    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }

    // using setter injection
    @Autowired
    public DemoController(
            @Qualifier("baseballCoach") Coach theCoach,
            @Qualifier("baseballCoach") Coach theSecondCoach) {
        System.out.println("Comin to ya from: " + getClass().getSimpleName());
        myCoach = theCoach;
        mySecondCoach = theSecondCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    // determine with boolean if the coaches are following singleton pattern
    @GetMapping ("/check")
    public String check() {
        return "Comparing beans: myCoach == secondCoach: " + (myCoach == mySecondCoach);
    }
}
