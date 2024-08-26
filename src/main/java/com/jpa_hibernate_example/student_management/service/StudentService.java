package com.jpa_hibernate_example.student_management.service;

import com.jpa_hibernate_example.student_management.model.Student;
import com.jpa_hibernate_example.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // it contains business logic
public class StudentService {

    @Autowired // creates an internal bean object
    private StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.save(student);
    }
}
