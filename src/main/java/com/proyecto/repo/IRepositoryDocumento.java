package com.proyecto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.model.DocumentoDTO;

public interface IRepositoryDocumento extends JpaRepository<DocumentoDTO, Integer>{

}
