package com.proyecto.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class ClienteDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_cliente;	
	private String nom_cliente;			
	private String ape_cliente;			
	private String dni_cliente;			
	private String correo_cliente;		
	private String direc_cliente;		
	private String telefono_cliente;
	
	@OneToMany(mappedBy = "codCliente")
	private List<SolicitudEventoDTO> listaDocumento;
	
	
	public Integer getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(Integer cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public String getNom_cliente() {
		return nom_cliente;
	}
	public void setNom_cliente(String nom_cliente) {
		this.nom_cliente = nom_cliente;
	}
	public String getApe_cliente() {
		return ape_cliente;
	}
	public void setApe_cliente(String ape_cliente) {
		this.ape_cliente = ape_cliente;
	}
	public String getDni_cliente() {
		return dni_cliente;
	}
	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}
	public String getCorreo_cliente() {
		return correo_cliente;
	}
	public void setCorreo_cliente(String correo_cliente) {
		this.correo_cliente = correo_cliente;
	}
	public String getDirec_cliente() {
		return direc_cliente;
	}
	public void setDirec_cliente(String direc_cliente) {
		this.direc_cliente = direc_cliente;
	}
	public String getTelefono_cliente() {
		return telefono_cliente;
	}
	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}
	
	
	
	
}
