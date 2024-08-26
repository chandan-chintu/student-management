package com.jpa_hibernate_example.student_management.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // it refers as an model or entity class
@Data // it adds getter and setters constructors
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student")// it creates table inside database
public class Student {

    @Id // it refers as primary key and it cannot be duplicated
    @Column(name="student_id") // it creates a column in table
    private int studentId;

    @Column(name="name", nullable = false)// nullable = true - optional field
    private String name;

    @Column(name="dob",  nullable = false)// nullable = false - mandatory field
    private String dob;

    @Column(name="grade",  nullable = false)
    private String grade;

    @Column(name="section",  nullable = false)
    private String section;
}
