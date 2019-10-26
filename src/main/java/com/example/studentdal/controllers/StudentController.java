package com.example.studentdal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/showStudent")
    public String showStudent() {
        return "createStudent";
    }
}
