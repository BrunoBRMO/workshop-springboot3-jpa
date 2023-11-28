package com.projetobruno.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobruno.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>  {
	
}
