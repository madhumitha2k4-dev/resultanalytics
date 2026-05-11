package com.student.resultanalytics.repository;

import com.student.resultanalytics.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByDepartment(String department);

List<Student> findBySgpaLessThan(double sgpa);

Student findTopByOrderBySgpaDesc();
}

