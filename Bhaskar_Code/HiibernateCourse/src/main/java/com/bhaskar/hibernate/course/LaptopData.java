package com.bhaskar.hibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

//@Embeddable
@Entity
@Table(name="laptopdata")
public class LaptopData {

    @Id
    private int lid;
    private String model;
    private String brand;
    private int ram;

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
