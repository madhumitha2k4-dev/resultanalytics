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

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }

    @PutMapping("/{id}")
public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {

    Student existingStudent = studentService.getStudentById(id);

    existingStudent.setName(student.getName());
    existingStudent.setUsn(student.getUsn());
    existingStudent.setDepartment(student.getDepartment());
    existingStudent.setSemester(student.getSemester());
    existingStudent.setMarks1(student.getMarks1());
    existingStudent.setMarks2(student.getMarks2());
    existingStudent.setMarks3(student.getMarks3());
    existingStudent.setAverage(student.getAverage());
    existingStudent.setSgpa(student.getSgpa());
    existingStudent.setEmail(student.getEmail());

    return studentService.saveStudent(existingStudent);
}
    @GetMapping("/topper")
public Student getTopper() {
    return studentService.getTopper();
}

@GetMapping("/failed")
public List<Student> getFailedStudents() {
    return studentService.getFailedStudents();
}

@GetMapping("/department/{department}")
public List<Student> getByDepartment(@PathVariable String department) {
    return studentService.getStudentsByDepartment(department);
}

@GetMapping("/average-sgpa")
public double getAverageSgpa() {
    return studentService.getAverageSgpa();
}
}