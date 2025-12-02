package com.educandoweb.courseSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.courseSpring.entities.User;
import com.educandoweb.courseSpring.services.UserServices;

@RestController
@RequestMapping(value= "/users")
public class UserResources {
	
	@Autowired
	private UserServices services;
	
	@GetMapping
	public ResponseEntity <List<User>> findAll(){
		List<User> obj = services.findAll();
	    return ResponseEntity.ok().body(obj);
		
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findByld(@PathVariable Integer id){
		User obj = services.findByld(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
	

}
