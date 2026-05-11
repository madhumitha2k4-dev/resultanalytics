package com.student.resultanalytics.repository;

import com.student.resultanalytics.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
