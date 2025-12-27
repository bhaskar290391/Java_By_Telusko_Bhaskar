package com.bhaskar.spring.app;

import com.bhaskar.spring.app.model.Alien;
import com.bhaskar.spring.app.model.Laptop;
import com.bhaskar.spring.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service =context.getBean(LaptopService.class);
        //Getting Alien object
        Laptop obj=context.getBean(Laptop.class);
		service.addLaptop(obj);


	}

}
