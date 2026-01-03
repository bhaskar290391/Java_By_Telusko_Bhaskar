package com.bhaskar.ecom.service;

import com.bhaskar.ecom.dao.ProductRepository;
import com.bhaskar.ecom.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts(){
        return  repository.findAll();
    }

    public Product getProductById(int id) {
        return  repository.findById(id).orElse(new Product());
    }
}
