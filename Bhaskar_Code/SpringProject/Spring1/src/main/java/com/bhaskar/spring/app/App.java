package com.bhaskar.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Alien obj= (Alien) context.getBean("alien");
        System.out.println("Age ==> " +obj.getAge());
        System.out.println("Salary ==>"+obj.getSalary());
        obj.code();

//        Alien obj1= (Alien) context.getBean("alien");
//        //obj1.code();
//        System.out.println(obj1.age);
//
//        System.out.println( "Hello World!" );
    }
}
