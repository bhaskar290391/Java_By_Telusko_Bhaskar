package com.bhaskar.jpa;

import com.bhaskar.jpa.dao.StudentRepository;
import com.bhaskar.jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootJpaDemoApplication.class, args);
		StudentRepository repo=context.getBean(StudentRepository.class);

		Student s=new Student();
		s.setStudentId(29);
		s.setStudentMarks(55);
		s.setStudentName("Bhaskar");


		Student s1=new Student();
		s1.setStudentId(10);
		s1.setStudentMarks(65);
		s1.setStudentName("Kanishk");


		Student s2=new Student();
		s2.setStudentId(20);
		s2.setStudentMarks(75);
		s2.setStudentName("sammy");

		repo.save(s);
		repo.save(s1);
		repo.save(s2);

	}

}
