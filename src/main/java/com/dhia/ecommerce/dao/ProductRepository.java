package com.dhia.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhia.ecommerce.entities.*;

public interface ProductRepository extends JpaRepository<Product,Long> {
	
	

}
