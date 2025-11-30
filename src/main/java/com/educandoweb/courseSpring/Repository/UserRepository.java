package com.educandoweb.courseSpring.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	

}
