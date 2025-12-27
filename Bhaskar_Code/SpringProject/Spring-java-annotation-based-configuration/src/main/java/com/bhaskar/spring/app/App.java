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

    }
}
