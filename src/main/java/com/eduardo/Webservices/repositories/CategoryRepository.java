package com.eduardo.Webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.Webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
