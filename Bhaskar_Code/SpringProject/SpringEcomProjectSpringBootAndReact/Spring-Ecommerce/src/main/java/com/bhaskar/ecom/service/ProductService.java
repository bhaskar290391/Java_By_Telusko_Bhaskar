package com.bhaskar.ecom.service;

import com.bhaskar.ecom.dao.ProductRepository;
import com.bhaskar.ecom.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts(){
        return  repository.findAll();
    }

    public Product getProductById(int id) {
        return  repository.findById(id).orElse(new Product(-1));
    }

    public Product saveorUpdateProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImage(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return  repository.save(product);
    }

    public void deleteProduct(int id) {
        repository.deleteById(id);
    }

    public List<Product> searchProduct(String keyword) {
        return  repository.searchProducts(keyword);
    }
}
