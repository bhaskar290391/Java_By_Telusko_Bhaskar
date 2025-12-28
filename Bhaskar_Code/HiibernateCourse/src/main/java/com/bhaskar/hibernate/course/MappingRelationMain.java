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

        Laptop laptop3 =new Laptop();
        laptop3.setLid(3);
        laptop3.setRam(16);
        laptop3.setBrand("Apple");
        laptop3.setModel("MacBook Pro");



        Alien alien=new Alien();
        alien.setAid(101);
        alien.setAname("Bhaskar");
        alien.setTech("java");

        Alien alien1=new Alien();
        alien1.setAid(102);
        alien1.setAname("Kanishk");
        alien1.setTech("Python");

        Alien alien2=new Alien();
        alien2.setAid(103);
        alien2.setAname("Sammy");
        alien2.setTech("AI");

        alien.setLaptop(Arrays.asList(laptop,laptop1));
        alien1.setLaptop(Arrays.asList(laptop1,laptop3));
        alien2.setLaptop(Arrays.asList(laptop3));

        laptop1.setAlien(Arrays.asList(alien,alien1));
        laptop.setAlien(Arrays.asList(alien));
        laptop3.setAlien(Arrays.asList(alien1,alien2)  );



        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Laptop.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session= sessionFactory.openSession();

        Transaction transaction =session.beginTransaction();

        session.persist(laptop);
        session.persist(laptop1);
        session.persist(laptop3);
        session.persist(alien);
        session.persist(alien1);
        session.persist(alien2);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}


