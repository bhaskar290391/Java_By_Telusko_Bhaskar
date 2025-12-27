package com.bhaskar.spring.app.config;

import com.bhaskar.spring.app.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //@Bean(name = {"com1","beast","desktop1"})
    @Bean
    public Desktop desktop(){
        return new Desktop();
    }
}
