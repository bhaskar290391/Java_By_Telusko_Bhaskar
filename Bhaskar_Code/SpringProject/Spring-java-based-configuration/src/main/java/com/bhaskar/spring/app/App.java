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

    Desktop desktop = context.getBean(Desktop.class);
    desktop.compile();






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
////        Alien obj1= (Alien) context.getBean("alien");
////        //obj1.code();
////        System.out.println(obj1.age);
////
////        System.out.println( "Hello World!" );
//
//        //Desktop d=context.getBean(Desktop.class);
    }
}
