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
        double average =
            (student.getMarks1()
            + student.getMarks2()
            + student.getMarks3()) / 3.0;

    double sgpa = average / 10;

    student.setAverage(average);
    student.setSgpa(sgpa);
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
    return studentRepository.findById(id).orElse(null);
}

    public void deleteStudent(Long id) {
    studentRepository.deleteById(id);
}

public Student getTopper() {
    return studentRepository.findTopByOrderBySgpaDesc();
}

public List<Student> getFailedStudents() {
    return studentRepository.findBySgpaLessThan(4.0);
}

public List<Student> getStudentsByDepartment(String department) {
    return studentRepository.findByDepartment(department);
}

public double getAverageSgpa() {

    List<Student> students = studentRepository.findAll();

    if (students.isEmpty()) {
        return 0;
    }

    double total = 0;

    for (Student student : students) {
        total += student.getSgpa();
    }

    return total / students.size();
}

    public Student updateStudent(Long id, Student updatedStudent) {

    Student existingStudent = studentRepository.findById(id).orElse(null);

    if (existingStudent != null) {

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setUsn(updatedStudent.getUsn());
        existingStudent.setDepartment(updatedStudent.getDepartment());
        existingStudent.setSemester(updatedStudent.getSemester());
        existingStudent.setEmail(updatedStudent.getEmail());

        return studentRepository.save(existingStudent);
    }

    return null;
}

}
