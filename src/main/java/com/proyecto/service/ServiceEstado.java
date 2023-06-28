package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.model.EstadoDTO;
import com.proyecto.repo.IRepositoryEstado;

@Service
public class ServiceEstado {

	@Autowired
	private IRepositoryEstado repo;
	
	public List<EstadoDTO> listadoEstado(){
		return repo.findAll();
	}
}
