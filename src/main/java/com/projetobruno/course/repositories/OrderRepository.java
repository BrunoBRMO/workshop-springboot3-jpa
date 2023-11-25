package com.projetobruno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobruno.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {
	
	

}
