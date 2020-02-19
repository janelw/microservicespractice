package com.infosys.demo.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import org.apache.commons.codec.digest.DigestUtils;



import com.infosys.demo.model.*;
import com.infosys.demo.repository.UserRepository;
import com.infosys.demo.repository.RoleRepository;



@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleService rs; 

    public User create(User user){
        Role role = new Role(0, "User");
        user.setRole(role);
        user.setPassword(DigestUtils.sha256Hex(user.getPassword()));
        return userRepository.saveAndFlush(user);
        
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findbyUsername(String username){
        return userRepository.findByUsername(username);
    }
    
}
