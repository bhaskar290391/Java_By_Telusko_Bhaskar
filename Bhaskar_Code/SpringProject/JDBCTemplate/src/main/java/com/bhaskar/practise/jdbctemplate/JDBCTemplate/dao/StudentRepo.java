package com.bhaskar.practise.jdbctemplate.JDBCTemplate.dao;

import com.bhaskar.practise.jdbctemplate.JDBCTemplate.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    public void save(Student s1) {
        System.out.println("Added");
    }


    public List<Student> findAll() {
        List<Student> students=new ArrayList<>();
        return students;
    }
}
