package com.bhaskar.hibernate.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UpdateDemo {
    public static void main() {

        Student student=new Student();
        student.setAge(33);
        student.setSname("Soni");
        student.setRollNo(1992);

        Student s1=new Student();
        student.setAge(29);
        student.setSname("Babu");
        student.setRollNo(1995);

        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(Student.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session= sessionFactory.openSession();

        Transaction transaction =session.beginTransaction();
        session.merge(s1);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println(student);
    }
}


