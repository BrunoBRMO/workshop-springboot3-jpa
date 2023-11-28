package com.projetobruno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobruno.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
	
}
