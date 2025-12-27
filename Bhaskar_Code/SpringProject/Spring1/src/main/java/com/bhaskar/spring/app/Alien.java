package com.bhaskar.spring.app;

public class Alien {

    private int age;
    private Laptop laptop;


    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

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
        laptop.compile();
    }
}
