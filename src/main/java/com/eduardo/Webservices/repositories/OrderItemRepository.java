package com.eduardo.Webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.Webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
