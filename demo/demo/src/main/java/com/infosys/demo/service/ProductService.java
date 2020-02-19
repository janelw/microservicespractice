package com.infosys.demo.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.demo.model.*;
import com.infosys.demo.repository.ProductRepository;



@Service
public class ProductService{

    @Autowired
    private ProductRepository productRepository;
    
    public Product create(Product product){
        return productRepository.save(product);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }
     

}