package com.bhaskar.jpa.dao;

import com.bhaskar.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findByStudentName(String studentName);
    List<Student> findByStudentMarks(int marks);
    List<Student> findByStudentMarksGreaterThan(int marks);

}
