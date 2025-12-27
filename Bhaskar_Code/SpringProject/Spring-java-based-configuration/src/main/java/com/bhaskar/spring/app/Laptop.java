package com.bhaskar.spring.app;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Object is created");


    }

    @Override
    public void compile(){
        System.out.println("Compiling.. By Laptop");
    }
}
