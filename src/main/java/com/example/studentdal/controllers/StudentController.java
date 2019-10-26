package com.example.studentdal.controllers;

import com.example.studentdal.entities.Student;
import com.example.studentdal.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @Autowired
    StudentService service;

    @RequestMapping("/showStudent")
    public String showStudent() {
        return "createStudent";
    }

    @RequestMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student, ModelMap modelMap){
        Student studentSaved = service.saveStudent(student);
        String msg = "Student saved with id: " + studentSaved.getId();
        modelMap.addAttribute("msg", msg);

        return "createStudent";
    }
}
