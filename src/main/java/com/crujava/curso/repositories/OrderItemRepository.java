package com.crujava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crujava.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
