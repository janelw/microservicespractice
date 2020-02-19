package com.infosys.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;



import com.infosys.demo.model.*;
import com.infosys.demo.service.*;;

@RestController
@CrossOrigin
@RequestMapping("/role")
public class RoleController{

    @Autowired
    private RoleService rs;


    @PostMapping("/create")
    public Role createRole(@RequestBody Role role){
        return rs.create(role);
    }

    @GetMapping("getById/{role}")
    public Role getByRole(@PathVariable Integer id){
        return rs.findRoleById(id);
    }
    
}