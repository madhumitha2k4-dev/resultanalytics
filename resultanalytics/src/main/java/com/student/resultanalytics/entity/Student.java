package com.student.resultanalytics.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String usn;
    private String department;
    private int semester;
    private String email;

    private int marks1;
    private int marks2;
    private int marks3;

    private double average;
    private double sgpa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMarks1() {
    return marks1;
}

public void setMarks1(int marks1) {
    this.marks1 = marks1;
}

public int getMarks2() {
    return marks2;
}

public void setMarks2(int marks2) {
    this.marks2 = marks2;
}

public int getMarks3() {
    return marks3;
}

public void setMarks3(int marks3) {
    this.marks3 = marks3;
}

public double getAverage() {
    return average;
}

public void setAverage(double average) {
    this.average = average;
}

public double getSgpa() {
    return sgpa;
}

public void setSgpa(double sgpa) {
    this.sgpa = sgpa;
}
}
