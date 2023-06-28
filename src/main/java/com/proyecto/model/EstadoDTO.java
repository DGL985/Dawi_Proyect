package com.proyecto.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_estado")
public class EstadoDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_estado")
	private Integer cod_estado;
	
	@Column(name="descripcion_est")
	private String descripcionEstado;
	
	@OneToMany(mappedBy = "codEstado")
	private List<SolicitudEventoDTO> listaEvenetos;

	public Integer getCod_estado() {
		return cod_estado;
	}

	public void setCod_estado(Integer cod_estado) {
		this.cod_estado = cod_estado;
	}

	public String getDescripcionEstado() {
		return descripcionEstado;
	}

	public void setDescripcionEstado(String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}

	public List<SolicitudEventoDTO> getListaEvenetos() {
		return listaEvenetos;
	}

	public void setListaEvenetos(List<SolicitudEventoDTO> listaEvenetos) {
		this.listaEvenetos = listaEvenetos;
	}
	
	
	
	
}
