package com.eduardo.Webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardo.Webservices.entities.Category;
import com.eduardo.Webservices.repositories.CategoryRepository;

@Service //REGISTRA A CLASSE COMO COMPONENTE DO SPRING
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findALL(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}

	

}
