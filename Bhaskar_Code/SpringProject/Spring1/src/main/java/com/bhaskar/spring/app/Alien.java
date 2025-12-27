package com.bhaskar.spring.app;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Laptop laptop;
    private Double salary;

    @ConstructorProperties({"age","laptop","salary"})
    public Alien(int age, Laptop laptop, Double salary) {
        this.age = age;
        this.laptop = laptop;
        this.salary = salary;
    }

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Alien() {
        System.out.println("Alien object is created");
    }

    public void code(){
        System.out.println("Coding..");
        laptop.compile();
    }
}
