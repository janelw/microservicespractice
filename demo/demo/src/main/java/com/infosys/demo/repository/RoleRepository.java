package com.infosys.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import com.infosys.demo.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{


    @Query(value = "SELECT roleid from userr u  WHERE u.id =:id", nativeQuery = true)
    Role findRoleById(@Param( "id") Integer id);
}