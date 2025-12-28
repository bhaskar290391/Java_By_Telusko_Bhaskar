package com.bhaskar.hibernate.course;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "alien_table")
public class Alien {

    @Id
    @Column(name = "alien_id")
    private int aid;

    @Column(name = "alien_name")
    private String aname;

    //@Transient
    @Column(name = "alien_tech")
    private String tech;

    //@OneToOne()
    @OneToMany(mappedBy = "alien")
    private List<Laptop> laptop;

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
