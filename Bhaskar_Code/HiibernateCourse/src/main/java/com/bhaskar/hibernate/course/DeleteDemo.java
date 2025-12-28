package com.bhaskar.hibernate.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeleteDemo {
    public static void main() {

        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(Student.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session= sessionFactory.openSession();
        Student student=session.find(Student.class,1992);

        Transaction transaction =session.beginTransaction();
        session.remove(student);
        transaction.commit();

        session.close();
        sessionFactory.close();
        System.out.println(student);
    }
}


