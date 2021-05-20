package com.dhia.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dhia.ecommerce.entities.*;
@CrossOrigin
public interface ProductRepository extends JpaRepository<Product,Long> {
	
	

}
