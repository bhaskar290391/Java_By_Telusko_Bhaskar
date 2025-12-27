package com.bhaskar.spring.app.config;

import com.bhaskar.spring.app.Alien;
import com.bhaskar.spring.app.Computer;
import com.bhaskar.spring.app.Desktop;
import com.bhaskar.spring.app.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.bhaskar.spring.app"})
public class AppConfig {


}
