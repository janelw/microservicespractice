package com.infosys.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.infosys.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
    @Query(value = "SELECT * FROM userr WHERE u.username =:username", nativeQuery = true)
    User  findByUsername(@Param( "username") String username);
}
