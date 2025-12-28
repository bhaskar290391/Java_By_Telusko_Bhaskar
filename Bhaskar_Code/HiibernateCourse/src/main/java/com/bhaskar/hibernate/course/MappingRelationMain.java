package com.bhaskar.hibernate.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;


public class MappingRelationMain {
    public static void main() {

        Laptop laptop =new Laptop();
        laptop.setLid(1);
        laptop.setRam(16);
        laptop.setBrand("Asus");
        laptop.setModel("Rog");

        Laptop laptop1 =new Laptop();
        laptop1.setLid(2);
        laptop1.setRam(8);
        laptop1.setBrand("Dell");
        laptop1.setModel("XPS");



        Alien alien=new Alien();
        alien.setAid(101);
        alien.setAname("Bhaskar");
        alien.setTech("java");
        alien.setLaptop(Arrays.asList(laptop,laptop1));

        laptop1.setAlien(alien);
        laptop.setAlien(alien);



        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Laptop.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session= sessionFactory.openSession();

        Transaction transaction =session.beginTransaction();

        session.persist(laptop);
        session.persist(laptop1);
        session.persist(alien);

        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println(alien);
    }
}


