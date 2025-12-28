package com.bhaskar.hibernate.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class HQLDemo {
    public static void main() {



        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(LaptopData.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session= sessionFactory.openSession();

        Query query=session.createQuery("from LaptopData where  ram =16");
        List<LaptopData> laptops=query.getResultList();
        System.out.println(laptops);
        session.close();
        sessionFactory.close();

    }}
