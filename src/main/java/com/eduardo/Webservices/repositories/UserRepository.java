package com.eduardo.Webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.Webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
