package com.bhaskar.practise.jdbctemplate.JDBCTemplate;

import com.bhaskar.practise.jdbctemplate.JDBCTemplate.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JdbcTemplateApplication.class, args);
		Student s1=context.getBean(Student.class);

		s1.setRollNo(29);
		s1.setName("Bhaskar");
		s1.setMarks(85);

		addStudent(s1);
	}

}
