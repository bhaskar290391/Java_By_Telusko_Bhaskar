package com.bhaskar.hibernate.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main() {

        Student student=new Student();
        student.setAge(27);
        student.setSname("Soni");
        student.setRollNo(1992);

        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(com.bhaskar.hibernate.course.Student.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session= sessionFactory.openSession();

        Transaction transaction =session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println(student);
    }
}


