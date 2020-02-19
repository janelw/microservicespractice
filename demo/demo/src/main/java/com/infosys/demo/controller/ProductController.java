package com.infosys.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;



import com.infosys.demo.model.*;
import com.infosys.demo.service.*;;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController{

    @Autowired
    private ProductService ps;

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return ps.create(product);
    }
    @GetMapping("/all")
    public List<Product> getAllProduct(){
        return ps.findAll();
    }
    
}
