package com.example.studentdal.controllers;

import com.example.studentdal.entities.Student;
import com.example.studentdal.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //@Controller
public class StudentController {

    @Autowired
    StudentService service;

    @RequestMapping("/showStudent")
    public String showStudent() {
        return "createStudent";
    }

    @GetMapping("/listStudents")
    public List<Student> listStudents() {
        return service.getAllStudents();
    }

    @RequestMapping(value = "/deleteStudent/{id}", method = RequestMethod.POST)
    public boolean deleteStudent(@PathVariable("id") long id){
        Student student = service.getStudent(id);
        service.deleteStudent(student);
        return service.existsById(id);
    }

    @RequestMapping("/saveStudent")
    public Long saveStudent(@ModelAttribute("student") Student student, ModelMap modelMap) {
        Student studentSaved = service.saveStudent(student);
        //String msg = "Student saved with id: " + studentSaved.getId();
        //modelMap.addAttribute("msg", msg);
        //return "createStudent";
        return studentSaved.getId();
    }

}
