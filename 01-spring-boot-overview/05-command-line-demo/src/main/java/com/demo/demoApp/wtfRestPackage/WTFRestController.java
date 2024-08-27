package com.demo.demoApp.wtfRestPackage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WTFRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello bruh!!!";
    }

    @GetMapping("/say")
    public String sayBruh() {
        return "SAY BRUHHH :))";
    }
}
