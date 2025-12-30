package com.bhaskar.practise.jdbctemplate.JDBCTemplate.service;

import com.bhaskar.practise.jdbctemplate.JDBCTemplate.dao.StudentRepo;
import com.bhaskar.practise.jdbctemplate.JDBCTemplate.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public void addStudent(Student s1) {
        repo.save(s1);
    }

    public List<Student> getStudents() {

       return repo.findAll();
    }
}
