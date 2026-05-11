package com.student.resultanalytics.service;

import java.util.List;
import com.student.resultanalytics.entity.Student;
import com.student.resultanalytics.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
    return studentRepository.findById(id).orElse(null);
}
}
