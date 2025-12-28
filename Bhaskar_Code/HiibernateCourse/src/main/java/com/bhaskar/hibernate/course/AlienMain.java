package com.bhaskar.hibernate.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class AlienMain {
    public static void main() {

        Alien alien=new Alien();
        alien.setAid(29);
        alien.setAname("Bhaskar");
        alien.setTech("java");

        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(Alien.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session= sessionFactory.openSession();

        Transaction transaction =session.beginTransaction();
        session.persist(alien);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println(alien);
    }
}


