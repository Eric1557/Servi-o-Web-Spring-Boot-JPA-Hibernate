package com.educandoweb.courseSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.courseSpring.Repository.UserRepository;
import com.educandoweb.courseSpring.entities.User;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	public User findByld(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}
	

}
