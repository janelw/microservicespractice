package com.infosys.demo.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;



import com.infosys.demo.model.CustOrder;


@Repository
public interface OrderRepository extends JpaRepository<CustOrder, Integer>{
   

}