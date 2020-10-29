package com.crujava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crujava.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
