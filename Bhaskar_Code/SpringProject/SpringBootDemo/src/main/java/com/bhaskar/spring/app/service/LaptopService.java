package com.bhaskar.spring.app.service;

import com.bhaskar.spring.app.model.Laptop;
import com.bhaskar.spring.app.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repository;

    public void addLaptop(Laptop laptop){
        repository.save(laptop);
        System.out.println("Service called");
    }

    public boolean isGoodForPrograming(Laptop laptop){
        return true;
    }
}
