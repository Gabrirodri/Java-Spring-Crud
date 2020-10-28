package com.crujava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crujava.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
