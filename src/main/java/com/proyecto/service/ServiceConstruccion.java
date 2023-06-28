package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.model.Construccion;

import com.proyecto.repo.IConstruccionRepository;

@Service
public class ServiceConstruccion {
	
	@Autowired
	private IConstruccionRepository repo;
	
	public void grabarDoc (Construccion sol) {
		repo.save(sol);
	}
	
	public void eliminar(int cod) {
		repo.deleteById(cod);
	}
	
	public Construccion buscar(int cod) {
		return repo.findById(cod).orElse(null);
	}
	
	public List<Construccion> listadoDocConstruccion(){
		return repo.findAll();
	}

	
}

