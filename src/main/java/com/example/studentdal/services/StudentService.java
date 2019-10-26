package com.example.studentdal.services;

import com.example.studentdal.entities.Student;
import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void deleteStudent(Student student);

    Student getStudent(Long id);
}
