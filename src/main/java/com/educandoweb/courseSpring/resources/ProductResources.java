package com.educandoweb.courseSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.courseSpring.entities.Product;
import com.educandoweb.courseSpring.services.ProductServices;

@RestController
@RequestMapping(value = "/products")
public class ProductResources {
	
	@Autowired
	private ProductServices services;
	
	@GetMapping
	public ResponseEntity <List<Product>> findAll(){
		List<Product> obj = services.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findByld(@PathVariable Integer id){
		Product obj = services.findByld(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
