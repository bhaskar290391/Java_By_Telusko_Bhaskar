package com.bhaskar.spring.app;

import com.bhaskar.spring.app.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1= context.getBean(Alien.class);
        obj1.code();
        System.out.println(obj1.getAge());


        Desktop desktop = context.getBean(Desktop.class);
        desktop.compile();




//    Desktop desktop1 = context.getBean(,Desktop.class);
//    desktop1.compile();

//    System.out.println(desktop1 ==desktop);






//        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//        //Getting object by bean id which provide object
//        //Alien obj= (Alien) context.getBean("alien");
//
//
//        //getting object by type
//        Alien obj=context.getBean("alien",Alien.class);
//
//
//        System.out.println("Age ==> " +obj.getAge());
//        System.out.println("Salary ==>"+obj.getSalary());
//        obj.code();
//
////

    }
}
