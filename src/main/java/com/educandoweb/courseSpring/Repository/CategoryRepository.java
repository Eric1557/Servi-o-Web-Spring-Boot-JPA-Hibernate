package com.educandoweb.courseSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
