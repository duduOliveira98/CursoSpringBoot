package com.eduardo.Webservices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.Webservices.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L,"EDUARDO","EDU@GMAIL.COM","9999999","123456");
		return ResponseEntity.ok(u);
	}

}
