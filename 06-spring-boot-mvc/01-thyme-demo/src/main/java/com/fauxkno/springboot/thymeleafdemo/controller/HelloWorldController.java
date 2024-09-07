package com.fauxkno.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    // need a controller method to show the initial HTML form
    @RequestMapping("/showform")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process form input
    @RequestMapping("/processform")
    public String processForm() {
        return "helloworld";
    }

    // need a controller method to read form data
    // add data to the model
    
}
