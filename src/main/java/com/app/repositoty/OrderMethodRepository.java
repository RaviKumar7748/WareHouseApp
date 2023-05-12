package com.app.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.OrderMethod;
@Repository
public interface OrderMethodRepository  
extends JpaRepository<OrderMethod, Integer>
{

}
