package com.crujava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crujava.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
