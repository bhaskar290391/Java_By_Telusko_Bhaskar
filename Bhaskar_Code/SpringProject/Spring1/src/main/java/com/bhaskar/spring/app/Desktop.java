package com.bhaskar.spring.app;

public class Desktop implements  Computer{

    @Override
    public void compile() {
        System.out.println("Compiling ... Desktop");
    }
}
