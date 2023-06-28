package com.proyecto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.model.User;

public interface IRepositoryUser extends JpaRepository<User, Integer> {
	User findByusuario(String usuario);
}
