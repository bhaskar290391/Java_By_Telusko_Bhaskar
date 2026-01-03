package com.bhaskar.ecom.controller;

import com.bhaskar.ecom.entity.Product;
import com.bhaskar.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }


    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){

        Product product =service.getProductById(id);

        if(product.getId() >-1){
            return new ResponseEntity<>(product,HttpStatus.OK) ;
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile){
        try{
            Product data=service.saveProduct(product,imageFile);
            return new ResponseEntity<>(data,HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getProductImage(@PathVariable int productId){

        Product product =service.getProductById(productId);
        if(product.getId() >-1){
            return new ResponseEntity<>(product.getImage(),HttpStatus.OK) ;
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


}
