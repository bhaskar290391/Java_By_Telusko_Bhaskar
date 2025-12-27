package com.bhaskar.spring.app;

public class Alien {

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien() {
        System.out.println("Alien object is created");
    }

    public void code(){
        System.out.println("Coding..");
    }
}
