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
@Table(name="tb_documento")
public class DocumentoDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_documento")
	private Integer cod_doc;
	@Column(name="descripcion_doc")
	private String descr_doc;
	
	@OneToMany(mappedBy = "codDocumento")
	private List<SolicitudEventoDTO> listaDocumento;
	

	public Integer getCod_doc() {
		return cod_doc;
	}

	public void setCod_doc(Integer cod_doc) {
		this.cod_doc = cod_doc;
	}

	public String getDescr_doc() {
		return descr_doc;
	}

	public void setDescr_doc(String descr_doc) {
		this.descr_doc = descr_doc;
	}

	public List<SolicitudEventoDTO> getListaDocumento() {
		return listaDocumento;
	}

	public void setListaDocumento(List<SolicitudEventoDTO> listaDocumento) {
		this.listaDocumento = listaDocumento;
	}
	
}
