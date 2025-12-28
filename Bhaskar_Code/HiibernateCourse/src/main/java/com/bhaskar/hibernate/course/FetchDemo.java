package com.bhaskar.hibernate.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FetchDemo {
    public static void main() {
        Student student =new Student();
        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(Student.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session= sessionFactory.openSession();
        student=session.find(Student.class,2021);
        session.close();
        sessionFactory.close();
        System.out.println(student);
    }
}


