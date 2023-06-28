package com.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.model.DocumentoDTO;
import com.proyecto.repo.IRepositoryDocumento;

@Service
public class serviceDocumentos {

	@Autowired
	private IRepositoryDocumento repo;
	
	public List<DocumentoDTO> listaDocumento(){
		return repo.findAll();
	}
}
