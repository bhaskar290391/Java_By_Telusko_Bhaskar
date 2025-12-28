package com.bhaskar.hibernate.course;

import jakarta.persistence.*;

//@Embeddable
@Entity
@Table(name="laptop")
public class Laptop {

    @Id
    private int lid;
    private String model;
    private String brand;
    private int ram;

    @ManyToOne
    private Alien alien;

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
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
                "lid=" + lid +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                '}';
    }
}
