package com.fauxkno.springboot.thymeleafdemo.controller;

import com.fauxkno.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> systems;

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {
        // create a student object
        Student theStudent = new Student();

        // add created student as attribute into the model
        theModel.addAttribute("student", theStudent);

        // add the list of countries to the model (from application.properties)
        theModel.addAttribute("countries", countries);

        // add the list of languages to the model (from application.properties)
        theModel.addAttribute("languages", languages);

        // add the list of systems to the model (from application.properties)
        theModel.addAttribute("systems", systems);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

        return "student-confirmation";
    }
}
