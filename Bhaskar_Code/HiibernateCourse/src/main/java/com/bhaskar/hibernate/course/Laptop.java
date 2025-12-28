package com.bhaskar.hibernate.course;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {

    private String model;
    private String brand;
    private int ram;

    Laptop(){
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                '}';
    }
}
