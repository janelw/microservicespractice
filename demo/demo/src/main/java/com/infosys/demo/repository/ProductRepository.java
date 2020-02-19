package com.infosys.demo.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.infosys.demo.model.Product;
import com.infosys.demo.model.User;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
   
}
