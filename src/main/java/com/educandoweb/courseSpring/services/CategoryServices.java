package com.educandoweb.courseSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseSpring.Repository.CategoryRepository;
import com.educandoweb.courseSpring.entities.Category;

@Service
public class CategoryServices {

	@Autowired
	private CategoryRepository repository;
	
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findByld(int id){
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
