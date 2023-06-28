package com.proyecto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name ="tb_solicitud_construccion")
public class Construccion {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_soli_evento")
	private int cod_soli_const; 
	@Column(name="nro_partida")
	private String nro_partida;
	@Column(name="nro_asiento")
	private String nro_asiento;
	@Column(name="nro_partida_electronica")
	private String nro_partida_electronica;
	@Column(name="nro_ficha")
	private String nro_ficha;
	@Column(name="nro_expediente")
	private String nro_expediente;
	@Column(name="documento_simple")
	private String documento_simple;
	@Column(name="cod_cliente")
	private int cod_cliente;
	
	@ManyToOne
	@JoinColumn(name="cod_estado")
	private EstadoDTO codEstado; 
	
	//rel documento
	@ManyToOne
	@JoinColumn(name="cod_documento")
	private DocumentoDTO codDocumento;
	
	public int getCod_soli_const() {
		return cod_soli_const;
	}
	public void setCod_soli_const(int cod_soli_const) {
		this.cod_soli_const = cod_soli_const;
	}
	public String getNro_partida() {
		return nro_partida;
	}
	public void setNro_partida(String nro_partida) {
		this.nro_partida = nro_partida;
	}
	public String getNro_asiento() {
		return nro_asiento;
	}
	public void setNro_asiento(String nro_asiento) {
		this.nro_asiento = nro_asiento;
	}
	public String getNro_partida_electronica() {
		return nro_partida_electronica;
	}
	public void setNro_partida_electronica(String nro_partida_electronica) {
		this.nro_partida_electronica = nro_partida_electronica;
	}
	public String getNro_ficha() {
		return nro_ficha;
	}
	public void setNro_ficha(String nro_ficha) {
		this.nro_ficha = nro_ficha;
	}
	public String getNro_expediente() {
		return nro_expediente;
	}
	public void setNro_expediente(String nro_expediente) {
		this.nro_expediente = nro_expediente;
	}
	public String getDocumento_simple() {
		return documento_simple;
	}
	public void setDocumento_simple(String documento_simple) {
		this.documento_simple = documento_simple;
	}
	public int getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public EstadoDTO getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(EstadoDTO codEstado) {
		this.codEstado = codEstado;
	}

	public DocumentoDTO getCodDocumento() {
		return codDocumento;
	}

	public void setCodDocumento(DocumentoDTO codDocumento) {
		this.codDocumento = codDocumento;
	}
}