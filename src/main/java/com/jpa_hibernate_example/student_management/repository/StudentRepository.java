package com.jpa_hibernate_example.student_management.repository;

import com.jpa_hibernate_example.student_management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // it is data layer and it performs database activities
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
