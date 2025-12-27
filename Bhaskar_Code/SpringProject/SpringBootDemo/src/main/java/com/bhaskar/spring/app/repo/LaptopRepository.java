package com.bhaskar.spring.app.repo;

import com.bhaskar.spring.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop)
    {
        System.out.println("Saving Laptop");
    }
}
