package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.model.ClienteDTO;
import com.proyecto.repo.IRepositoryCliente;

@Service
public class ServiceCliente {

	@Autowired
	private IRepositoryCliente repo;
	
	
	public void grabarCliente(ClienteDTO cli) {
		repo.save(cli);
	}
	
	public void eliminar(int cod) {
		repo.deleteById(cod);
	}
	
	public ClienteDTO buscar(int cod) {
		return repo.findById(cod).orElse(null);
	}
	
	public List<ClienteDTO> listaCliente(){
		return repo.findAll();
	}
	
}
