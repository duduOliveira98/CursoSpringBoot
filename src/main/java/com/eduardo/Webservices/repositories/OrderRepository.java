package com.eduardo.Webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.Webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
