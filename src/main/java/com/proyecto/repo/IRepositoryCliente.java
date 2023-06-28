package com.proyecto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.model.ClienteDTO;

public interface IRepositoryCliente extends JpaRepository<ClienteDTO, Integer> {

}
