package com.bhaskar.spring.app.service;

import com.bhaskar.spring.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop laptop){
        System.out.println("Service called");
    }

    public boolean isGoodForPrograming(Laptop laptop){
        return true;
    }
}
