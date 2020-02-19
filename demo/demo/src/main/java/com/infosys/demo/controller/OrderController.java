package com.infosys.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;



import com.infosys.demo.model.*;
import com.infosys.demo.service.*;;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController{

    @Autowired
    private OrderService os;
    
  

    @PostMapping("/create")
    public CustOrder createOrder(@RequestBody CustOrder order){
        return os.create(order);

    }

    @GetMapping("/all")
    public List<CustOrder> getAllOrders(){
        return os.findAll();
    }

    // @GetMapping("/getByUser/{user}")
    // public List<CustOrder> findbyUser(@PathVariable User user){
    //     return os.getAllByUser(user);
    // }

    }
