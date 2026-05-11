package com.student.resultanalytics.controller;

import com.student.resultanalytics.entity.Student;
import com.student.resultanalytics.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
public List<Student> getAllStudents() {
    return studentService.getAllStudents();
}
}
