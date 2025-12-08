package com.educandoweb.courseSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.courseSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
