package com.eduardo.Webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.Webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
