package com.educandoweb.courseSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseSpring.Repository.ProductRepository;
import com.educandoweb.courseSpring.entities.Product;
@Service
public class ProductServices {
	
	@Autowired
	private ProductRepository repository;
	
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findByld(Integer id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
	
	

}
