package com.proyecto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tb_login")
@Data
public class User {
	
	@Id
	private String usuario;
	@Column(name="passwor")
	private String passwor;
	
	public User() {
		super();
	}
	public User(String usuario, String passwor) {
		super();
		this.usuario = usuario;
		this.passwor = passwor;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPasswor() {
		return passwor;
	}
	public void setPasswor(String passwor) {
		this.passwor = passwor;
	}
	
	
}
