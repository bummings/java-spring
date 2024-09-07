package com.fauxkno.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    // need a controller method to show the initial HTML form
    @RequestMapping("/showform")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // need a controller method to process form input
    // need a controller method to read form data

    @RequestMapping("/processForm2")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        // read the request param from the html form
        String theName = request.getParameter("studentName");

        // convert data to all caps
        theName = theName.toUpperCase();

        // create message
        String result = "Yo, " + theName;

        // add message to model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processForm3")
    public String processFormV3(@RequestParam("studentName") String theName,
                                Model model) {

        // convert data to all caps
        theName = theName.toUpperCase();

        // create message
        String result = "Say, " + theName;

        // add message to model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
