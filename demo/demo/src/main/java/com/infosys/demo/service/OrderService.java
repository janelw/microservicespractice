package com.infosys.demo.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.demo.model.*;
import com.infosys.demo.repository.OrderRepository;

@Service
public class OrderService{

    @Autowired
    private OrderRepository orderRepository;

    public CustOrder create(CustOrder order){
        order.setDate(new Timestamp(System.currentTimeMillis()));
        return orderRepository.save(order);

    }

    public List<CustOrder> findAll(){
        return orderRepository.findAll();
    }

    // public List<CustOrder> getAllByUser(User user){
    //     return orderRepository.findByUser(user);
    // }
}

