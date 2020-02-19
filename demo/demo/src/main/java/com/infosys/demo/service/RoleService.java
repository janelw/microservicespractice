package com.infosys.demo.service;

import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import org.apache.commons.codec.digest.DigestUtils;



import com.infosys.demo.model.*;
import com.infosys.demo.repository.RoleRepository;

@Service
public class RoleService{

    @Autowired
    private RoleRepository roleRepository;

    public Role create(Role role){
        return roleRepository.saveAndFlush(role);
    }

    public Role findRoleById(Integer id){
        return roleRepository.findRoleById(id);
    }




 




}