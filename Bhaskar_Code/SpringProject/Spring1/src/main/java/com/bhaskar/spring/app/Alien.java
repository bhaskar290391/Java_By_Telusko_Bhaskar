package com.bhaskar.spring.app;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer computer;
    private Double salary;

    @ConstructorProperties({"age","laptop","salary"})
    public Alien(int age, Computer computer, Double salary) {
        this.age = age;
        this.computer = computer;
        this.salary = salary;
    }

    public Computer getLaptop() {
        return computer;
    }

    public void setLaptop(Computer computer) {
        this.computer = computer;
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
        computer.compile();
    }
}
