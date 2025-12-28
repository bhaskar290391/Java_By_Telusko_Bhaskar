package com.bhaskar.hibernate.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main() {

        Student student=new Student();
        student.setAge(10);
        student.setSname("Kanishk");
        student.setRollNo(2021);

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(com.bhaskar.hibernate.course.Student.class);

        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session= sessionFactory.openSession();

        Transaction transaction =session.beginTransaction();
        session.persist(student);
        transaction.commit();

        System.out.println(student);
    }
}


