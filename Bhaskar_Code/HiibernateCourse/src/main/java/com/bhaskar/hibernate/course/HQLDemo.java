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
        String brand="Apple";
        //Query query=session.createQuery("from LaptopData where  ram =16");
        //Query query=session.createQuery("from LaptopData where brand= ?1");
        //query.setParameter(1,brand);

        Query query=session.createQuery("select brand, model from LaptopData where  ram =?1");
        query.setParameter(1,16);


        //List<LaptopData> laptops=query.getResultList();
        //List<String> laptops=query.getResultList();

        List<Object[]> laptops=query.getResultList();

        for(Object[] laptop:laptops){
            System.out.println((String)laptop[0]+ " "+(String)laptop[1]);
        }

        session.close();
        sessionFactory.close();

    }}
