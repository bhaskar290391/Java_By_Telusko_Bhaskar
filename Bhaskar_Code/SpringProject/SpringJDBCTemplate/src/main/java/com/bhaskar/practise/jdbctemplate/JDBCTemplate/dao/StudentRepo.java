package com.bhaskar.practise.jdbctemplate.JDBCTemplate.dao;

import com.bhaskar.practise.jdbctemplate.JDBCTemplate.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    @Autowired
    private JdbcTemplate template ;

    public void save(Student s1) {

        String query="insert into student (rollno, name , marks) values (?,?,?)";

        int row =template.update(query,s1.getRollNo(),s1.getName(),s1.getMarks());
        System.out.println("The row affected by using insert "+ row);


    }


    public List<Student> findAll() {

        String query="select * from student";
        RowMapper<Student> rowMapper= (rs,rowNumber)->{
            Student s=new Student();
            s.setRollNo(rs.getInt("rollNo"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));

            return s;
        };
        return template.query(query,rowMapper);

    }
}
