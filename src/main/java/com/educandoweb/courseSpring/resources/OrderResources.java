package com.educandoweb.courseSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.courseSpring.entities.Order;
import com.educandoweb.courseSpring.services.OrderServices;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {
	
	@Autowired
	private OrderServices services;
	
	@GetMapping	
	public ResponseEntity<List<Order>> findAll(){
		List<Order> obj = services.findAll();
		return ResponseEntity.ok().body(obj);
		
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findByld(@PathVariable Integer id){
		Order obj = services.findByld(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
