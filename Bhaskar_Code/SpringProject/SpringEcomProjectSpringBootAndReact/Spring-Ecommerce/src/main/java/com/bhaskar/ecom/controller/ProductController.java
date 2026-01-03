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
            Product data=service.saveorUpdateProduct(product,imageFile);
            return new ResponseEntity<>(data,HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @PutMapping("/product/{id}")
    public ResponseEntity<String> createProduct(@PathVariable int id,@RequestPart Product product, @RequestPart MultipartFile imageFile){
        try{
            Product data=service.saveorUpdateProduct(product,imageFile);
            return new ResponseEntity<>("Updated", HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/product/{id}")
        public ResponseEntity<String> deleteProduct(@PathVariable int id){

        Product product =service.getProductById(id);

        if(product !=null){
            service.deleteProduct(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        }else{
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
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


    @GetMapping("products/search")
    public ResponseEntity<List<Product>> getProductsByName(@RequestParam String keyword){

        return  new ResponseEntity<>(service.searchProduct(keyword),HttpStatus.OK);
    }


}
