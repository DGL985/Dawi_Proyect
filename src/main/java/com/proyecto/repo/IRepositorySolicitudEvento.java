package com.proyecto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.model.SolicitudEventoDTO;

public interface IRepositorySolicitudEvento extends JpaRepository<SolicitudEventoDTO, Integer> {

}
