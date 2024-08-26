package com.jpa_hibernate_example.student_management.controller;

import com.jpa_hibernate_example.student_management.model.Student;
import com.jpa_hibernate_example.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    // controller <-> service <-> repository

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Student saves successfully";
    }

}
