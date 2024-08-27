package com.demo.demoApp.wtfRestPackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WTFRestController {

    // inject props
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }


    @GetMapping("/")
    public String sayHello() {
        return "Hello bruh!!!";
    }

    @GetMapping("/say")
    public String sayBruh() {
        return "SAY BRUHHH :))";
    }
}
