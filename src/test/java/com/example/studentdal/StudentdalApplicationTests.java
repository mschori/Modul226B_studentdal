package com.example.studentdal;

import com.example.studentdal.entities.Student;
import com.example.studentdal.repos.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void testCreateStudent(){
        Student student = new Student();
        student.setName("Michael");
        student.setCourse("Java for dummys");
        student.setFee(30d);

        studentRepository.save(student);
    }

    @Test
    public void findStudent(){
        Optional<Student> studentOptional = studentRepository.findById(1L);
        if (studentOptional.isPresent()){
            Student student = studentOptional.get();
            System.out.println(student.toString());
        }else{
            System.out.println("Keinen Studenten mit dieser ID gefunden.");
        }
    }

    @Test
    public void deleteStudent(){
        Optional<Student> studentOptional = studentRepository.findById(1L);
        if (studentOptional.isPresent()){
            Student student = studentOptional.get();
            studentRepository.delete(student);
        }else{
            System.out.println("Keinen Studenten mit dieser ID gefunden.");
        }
    }

    @Test
    public void updateStudent(){
        Optional<Student> studentOptional = studentRepository.findById(1L);
        if (studentOptional.isPresent()){
            Student student = studentOptional.get();
            student.setFee(30d);
            studentRepository.save(student);
        }else{
            System.out.println("Keinen Studenten mit dieser ID gefunden.");
        }
    }

}
