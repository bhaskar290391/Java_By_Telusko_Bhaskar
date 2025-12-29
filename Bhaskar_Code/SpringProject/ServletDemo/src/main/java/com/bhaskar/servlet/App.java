package com.bhaskar.servlet;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException, InterruptedException {

        Connector connector = new Connector();
        connector.setPort(8081);

        Tomcat tomcat =new  Tomcat();
        tomcat.getService().addConnector(connector);

        String webAppDir = "D:/Bhaskar_Learning_and_Development/Udemy/Java_By_Telusko_Bhaskar/Bhaskar_Code/SpringProject/ServletDemo/src/main/webapp";
        Context context = tomcat.addContext("",webAppDir);
        tomcat.addServlet(context,"HelloServlet",new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");
        System.out.println( "Hello World!" );

        tomcat.start();
        tomcat.getServer().await();
    }
}
