package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.model.SolicitudEventoDTO;

import com.proyecto.repo.IRepositorySolicitudEvento;

@Service
public class ServiceDocEvento {
	
	@Autowired
	private IRepositorySolicitudEvento repo;
	
	public void grabarDoc (SolicitudEventoDTO sol) {
		repo.save(sol);
	}
	
	public void eliminar(int cod) {
		repo.deleteById(cod);
	}
	
	public SolicitudEventoDTO buscar(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	
	public List<SolicitudEventoDTO> listadoDOCEvento(){
		return repo.findAll();
	}

	
}
