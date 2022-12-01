package com.educandoweb.sec23Project.WebServicesWithSpringBoot.JPA.Hibernate.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.sec23Project.WebServicesWithSpringBoot.JPA.Hibernate.entities.User;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> getAll(){
		User user = new User(1, "Helena Maria", "helena.maria@gmail.com", "11944443333", "0x00xx");
		return ResponseEntity.ok().body(user);
	}
	
}
