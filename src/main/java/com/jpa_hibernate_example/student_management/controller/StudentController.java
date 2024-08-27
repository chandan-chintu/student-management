package com.jpa_hibernate_example.student_management.controller;

import com.jpa_hibernate_example.student_management.model.Student;
import com.jpa_hibernate_example.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    // controller <-> service <-> repository

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Student saves successfully";
    }

    @GetMapping("/find/{studentid}")
    public Student getStudentById(@PathVariable("studentid") int studentId) {
        Student student = studentService.getStudentById(studentId);
        return student;
    }

    @GetMapping("/findall")
    public List<Student> getAllStudents(){
        List<Student> studentList = studentService.getAllStudents();
        return studentList;
    }

}
