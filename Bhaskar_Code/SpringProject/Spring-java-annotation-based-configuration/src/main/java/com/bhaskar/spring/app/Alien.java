package com.bhaskar.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("29")
    private int age;

    @Autowired
    //@Qualifier("desktop")
    private Computer computer;

    private Double salary;

//    @ConstructorProperties({"age","laptop","salary"})
//    public Alien(int age, Computer computer, Double salary) {
//        this.age = age;
//        this.computer = computer;
//        this.salary = salary;
//    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
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
