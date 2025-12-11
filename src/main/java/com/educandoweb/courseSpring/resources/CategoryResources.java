package com.educandoweb.courseSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.courseSpring.entities.Category;
import com.educandoweb.courseSpring.services.CategoryServices;

@RestController
@RequestMapping(name = "/category")
public class CategoryResources {

	@Autowired
	private CategoryServices services;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> obj = services.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
    @GetMapping(value = "/{id}")
	public ResponseEntity<Category> findByld(@PathVariable Integer id) {
		Category obj = services.findByld(id);
		return ResponseEntity.ok().body(obj);
	}
}
