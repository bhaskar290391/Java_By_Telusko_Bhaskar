package com.bhaskar.spring.app;

public class Desktop implements  Computer{
    public Desktop() {

        System.out.println("Desktop object is created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling ... Desktop");
    }
}
