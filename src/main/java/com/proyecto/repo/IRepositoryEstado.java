package com.proyecto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.model.EstadoDTO;

public interface IRepositoryEstado extends JpaRepository<EstadoDTO, Integer> {

}
