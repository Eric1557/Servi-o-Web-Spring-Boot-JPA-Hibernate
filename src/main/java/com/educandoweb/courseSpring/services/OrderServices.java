package com.educandoweb.courseSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseSpring.Repository.OrderRepository;
import com.educandoweb.courseSpring.entities.Order;

@Service
public class OrderServices {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
		
	}
	public Order findByld(Integer id){
	   Optional<Order> obj = repository.findById(id);
	   return obj.get();
	}

}
