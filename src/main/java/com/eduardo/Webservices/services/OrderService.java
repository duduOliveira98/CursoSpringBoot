package com.eduardo.Webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardo.Webservices.entities.Order;
import com.eduardo.Webservices.entities.User;
import com.eduardo.Webservices.repositories.OrderRepository;
import com.eduardo.Webservices.repositories.UserRepository;

@Service //REGISTRA A CLASSE COMO COMPONENTE DO SPRING
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findALL(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
	}

	

}
