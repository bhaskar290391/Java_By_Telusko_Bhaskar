package com.bhaskar.spring.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Object is created");


    }

    @Override
    public void compile(){
        System.out.println("Compiling.. By Laptop");
    }
}
